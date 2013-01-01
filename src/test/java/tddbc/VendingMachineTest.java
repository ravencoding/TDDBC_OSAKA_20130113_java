package tddbc;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VendingMachineTest {

    @Test
    public void 投入前に投入金額を取得したら0円() {
        VendingMachine sut = new VendingMachine();
        int actual = sut.getCreditAmount();
        assertThat(actual, is(0));
    }
}
