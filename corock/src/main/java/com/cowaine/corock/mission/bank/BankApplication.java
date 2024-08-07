package com.cowaine.corock.mission.bank;

import java.util.List;

class BankApplication {
    private static final int INITIAL_CUSTOMERS = 5;

    public static void main(String[] args) {
        Bank bank = new Bank();
        List<Account> accounts = createAccounts(bank);
        printAccountsInShell("=== 가입 계좌 현황 ===", accounts);
        bank.payInterestOnAllAccounts();
        printAccountsInShell("=== 이자 적용 후 계좌 현황 ===", accounts);

        Account myAccount = accounts.get(0);
        System.out.println("=== 서로 다른 통화 예금 시도 테스트 ===");
        myAccount.deposit(new Money(1_000L, Money.Currency.DOLLAR));
        System.out.println("=== 인출 시 잔액 초과 테스트 ===");
        myAccount.withdraw(new Money(10_000_000L, Money.Currency.WON));
    }

    /**
     * 초기 계정 생성
     *
     * @param bank
     * @return 성공적으로 생성된 계좌 목록
     * @throws InvalidMoneyException 금액이 음수이거나 지원하지 않는 통화인 경우
     */
    private static List<Account> createAccounts(Bank bank) {
        String[] names = { "이하늘", "박준영", "최지영", "정혜진", "황석민" };
        Long[] eachMoney = { 5000000L, 4000000L, -5700000L, 4100000L, 6000000L };
        Money.Currency[] currencies = {Money.Currency.WON, Money.Currency.WON,
                Money.Currency.WON, Money.Currency.WON, Money.Currency.YEN};

        List<Account> accounts = bank.getAccounts();
        for (int i = 0; i < INITIAL_CUSTOMERS; i++) {
            try {
                Money money = new Money(eachMoney[i], currencies[i]);
                Account newAccount = bank.openAccount(new Customer(names[i]), money);
                accounts.add(newAccount);
            } catch (InvalidMoneyException e) {
                System.out.println(names[i] + " 고객님! 계좌 생성에 실패했습니다.");
                System.out.println(e.getMessage());
                System.out.println("------------------------------");
                continue;
            }
        }
        return accounts;
    }

    private static void printAccountsInShell(String message, List<Account> accounts) {
        System.out.printf("%s%n", message);
        int count = 0;
        for (Account account : accounts) {
            System.out.printf("%d %s%n", ++count, account);
        }
        System.out.println();
    }
}
