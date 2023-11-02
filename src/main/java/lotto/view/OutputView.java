package lotto.view;

import lotto.domain.constants.OutputViewMessage;

public class OutputView {

    public void printInputMoneyMessage() {
        System.out.println(OutputViewMessage.INPUT_MONEY_MESSAGE.getMessage());
    }

    public void printPurchaseDetailsMessage(int lottoCount) {
        System.out.printf(OutputViewMessage.PURCHASE_DETAILS_MESSAGE.getMessage(), lottoCount);
        System.out.println();
    }

    public void printPurchasedLottos(String purchasedLottos) {
        System.out.print(purchasedLottos);
    }

    public void printInputWinningNumbersMessage() {
        System.out.println(OutputViewMessage.INPUT_WINNING_NUMBERS.getMessage());
    }

    public void printInputBonusNumberMessage() {
        System.out.println(OutputViewMessage.INPUT_BONUS_NUMBER.getMessage());
    }
}
