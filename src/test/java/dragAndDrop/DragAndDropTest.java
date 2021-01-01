/**
 * Created by youvegotnigel on 2021/01/01
 */
package dragAndDrop;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

import static org.testng.Assert.assertTrue;

public class DragAndDropTest extends BaseTests {

    @Test
    public void navigation() {

        DragAndDropPage dragAndDropPage = homePage.navigateToGuruDemoSite();
        dragAndDropPage.getPageName();
        assertTrue(dragAndDropPage.getPageName().contains("Demo Site"), "Landing Page is wrong!");
    }

    @Test
    public void verifyDragAndDrop(){

        DragAndDropPage dragAndDropPage = homePage.navigateToGuruDemoSite();

        dragAndDropPage.dragAndDrop(dragAndDropPage.fromCreditAccount(), dragAndDropPage.toCreditAccount());
        dragAndDropPage.dragAndDrop(dragAndDropPage.fromCreditAmount(), dragAndDropPage.toCreditAmount());
        dragAndDropPage.dragAndDrop(dragAndDropPage.fromDebitAccount(), dragAndDropPage.toDebitAccount());
        dragAndDropPage.dragAndDrop(dragAndDropPage.fromDebitAmount(), dragAndDropPage.toDebitAmount());
        assertTrue(dragAndDropPage.getResult().contains("Perfect"), "Perfect not Displayed !!!");

    }
}
