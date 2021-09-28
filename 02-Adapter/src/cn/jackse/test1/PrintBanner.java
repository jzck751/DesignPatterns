package cn.jackse.test1;

/**
 * @Description:
 * @author: Jack
 * @date: 2021年09月28日 22:38
 */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
