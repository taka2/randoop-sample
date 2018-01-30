import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(914894112, 14833);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 914908945);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply(914908945, 914908945);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == (-678514911));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(350, (int) ' ');
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11200);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 100, 914908945);
        int i15 = multiplyService0.multiply((int) '4', (-40840));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) '4', 1);
        int i12 = sumService0.add((int) ' ', 2369874);
        int i15 = sumService0.add(319, 53);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 53);
        org.junit.Assert.assertTrue(i12 == 2369906);
        org.junit.Assert.assertTrue(i15 == 372);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 10, 0);
        int i15 = multiplyService0.multiply(1351680, 4200);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1382088704);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(0, 3201);
        int i21 = sumService0.add(194, 236990600);
        int i24 = sumService0.add((int) (short) -1, (-4391));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 3201);
        org.junit.Assert.assertTrue(i21 == 236990794);
        org.junit.Assert.assertTrue(i24 == (-4392));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply(372, (int) (short) 10);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 3720);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply(3209, (-13070257));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) (short) 100, 818775862);
        int i12 = sumService0.add(194, 0);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 818775962);
        org.junit.Assert.assertTrue(i12 == 194);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(818775962, 350);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 818776312);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(36, 17688);
        int i21 = sumService0.add(377138528, 914908945);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 17724);
        org.junit.Assert.assertTrue(i21 == 1292047473);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply((int) (byte) 0, 1474200);
        int i21 = multiplyService0.multiply((-19208), 5660160);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1346170880));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(51450010, (-19208));
        int i18 = multiplyService0.multiply(3201, 234);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 749034);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) (short) 100, 818775862);
        int i12 = sumService0.add(882521996, 914894245);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 818775962);
        org.junit.Assert.assertTrue(i12 == 1797416241);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(3209, (int) (byte) 1);
        int i15 = multiplyService0.multiply(559150467, (int) (short) 1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 559150467);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply(42, 100);
        int i27 = multiplyService0.multiply((int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 4200);
        org.junit.Assert.assertTrue(i27 == 350);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 914894112);
        int i15 = sumService0.add((-13147), 14560000);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 914894245);
        org.junit.Assert.assertTrue(i15 == 14546853);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((-4339), 4256);
        int i12 = sumService0.add(2604000, 516);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == (-83));
        org.junit.Assert.assertTrue(i12 == 2604516);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add((int) (short) 100, 416);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 516);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-1), (-4392));
        int i12 = multiplyService0.multiply(2369842, 5660160);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 502029312);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(1, (int) (short) 10);
        int i15 = multiplyService0.multiply((int) (byte) -1, (-1536935));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((-678514911), 100);
        int i9 = multiplyService0.multiply(17821, (-4073));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 867985636);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4084), (-1536935));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-1541019));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply((-32), (-13147));
        int i18 = multiplyService0.multiply(749371392, 51471642);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1305542656);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1296581294, 160579584);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 1457160878);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 76440001);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-4073), 3209);
        int i15 = multiplyService0.multiply((-13129), 516);
        int i18 = multiplyService0.multiply((-1827510048), 559141712);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == (-13070257));
        org.junit.Assert.assertTrue(i15 == (-6774564));
        org.junit.Assert.assertTrue(i18 == 47277568);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(133, (int) (short) 1);
        int i18 = sumService0.add((int) (byte) 100, 377138625);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 134);
        org.junit.Assert.assertTrue(i18 == 377138725);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add((-2081677312), 0);
        int i24 = sumService0.add(76440000, 2604516);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == (-2081677312));
        org.junit.Assert.assertTrue(i24 == 79044516);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply(700, 915475213);
        int i15 = multiplyService0.multiply(914894345, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 882521996);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add(318, 51449979);
        int i24 = sumService0.add(897633037, (-1975096195));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 51450297);
        org.junit.Assert.assertTrue(i24 == (-1077463158));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-4073), 3209);
        int i15 = multiplyService0.multiply(11200, 14710);
        int i18 = multiplyService0.multiply((-4319), 1305542656);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == (-13070257));
        org.junit.Assert.assertTrue(i15 == 164752000);
        org.junit.Assert.assertTrue(i18 == 653328384);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add((-4391), (int) (short) 0);
        int i15 = sumService0.add(548, 0);
        int i18 = sumService0.add((-4319), (-6774564));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == (-4391));
        org.junit.Assert.assertTrue(i15 == 548);
        org.junit.Assert.assertTrue(i18 == (-6778883));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(1292047509, 1292047473);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == (-1710872314));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(42, 17688);
        int i18 = sumService0.add((int) '#', 3720);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 17730);
        org.junit.Assert.assertTrue(i18 == 3755);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add(559154859, (-31));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == 559154828);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(2370192, 386);
        int i24 = multiplyService0.multiply((-1), 1296581284);
        int i27 = multiplyService0.multiply((-1827510048), 132);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == (-1296581284));
        org.junit.Assert.assertTrue(i27 == (-713157760));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add(134, (int) (byte) 100);
        int i24 = sumService0.add(914894345, 276);
        int i27 = sumService0.add(234, 1382089121);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 234);
        org.junit.Assert.assertTrue(i24 == 914894621);
        org.junit.Assert.assertTrue(i27 == 1382089355);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add((-1296581151), 0);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-1296581151));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-4073), 3209);
        int i15 = multiplyService0.multiply(11200, 14710);
        int i18 = multiplyService0.multiply(145600, 236995050);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == (-13070257));
        org.junit.Assert.assertTrue(i15 == 164752000);
        org.junit.Assert.assertTrue(i18 == 712023936);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply((-1077463158), 1296581284);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == 1489053800);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add(502029312, (-1243225992));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == (-741196680));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-4073), 3209);
        int i15 = multiplyService0.multiply(818776312, (-699588608));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == (-13070257));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(700, 386);
        int i18 = sumService0.add(51450010, 4200);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1086);
        org.junit.Assert.assertTrue(i18 == 51454210);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(350, 42);
        int i12 = multiplyService0.multiply(14701, (-2081677312));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 14700);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(51450010, (int) (short) 1);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 51450011);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add((-4392), (int) (byte) 1);
        int i12 = sumService0.add(0, 1457160878);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == (-4391));
        org.junit.Assert.assertTrue(i12 == 1457160878);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) (short) 100, 818775862);
        int i12 = sumService0.add((-1537200), (-1833753176));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 818775962);
        org.junit.Assert.assertTrue(i12 == (-1835290376));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(51450000, (int) (byte) 10);
        int i15 = sumService0.add(318, 17730);
        int i18 = sumService0.add(2049805233, (-210011484));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 51450010);
        org.junit.Assert.assertTrue(i15 == 18048);
        org.junit.Assert.assertTrue(i18 == 1839793749);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(416, 1382088705);
        int i18 = sumService0.add(377138528, (int) (short) -1);
        int i21 = sumService0.add((int) (byte) 1, 700);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 1382089121);
        org.junit.Assert.assertTrue(i18 == 377138527);
        org.junit.Assert.assertTrue(i21 == 701);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply(1296581284, (int) (short) 1);
        int i15 = multiplyService0.multiply(165, 14700);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 2425500);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-4207), 2370192);
        int i12 = multiplyService0.multiply(1382089355, (-2081677312));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1381463152));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(0, 1352000);
        int i21 = multiplyService0.multiply((-4390), 1382088705);
        int i24 = multiplyService0.multiply((-40840), 4730810);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1419374298);
        org.junit.Assert.assertTrue(i24 == 67247920);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(53, 1);
        int i18 = multiplyService0.multiply(377157165, 1296581294);
        int i21 = multiplyService0.multiply(1382089355, (-318));
        int i24 = multiplyService0.multiply(133, 2369842);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 53);
        org.junit.Assert.assertTrue(i18 == (-1062015850));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 315188986);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(3209, (int) (byte) 1);
        int i15 = multiplyService0.multiply(160579584, 1474200);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 710279168);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(377157165, 1382088704);
        int i27 = sumService0.add(0, 1419374298);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == 1419374298);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(319, 97);
        int i18 = sumService0.add((int) (short) 1, (-912620105));
        int i21 = sumService0.add(1334161400, 818776312);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 416);
        org.junit.Assert.assertTrue(i18 == (-912620104));
        org.junit.Assert.assertTrue(i21 == (-2142029584));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply(1759245869, 377138725);
        int i24 = multiplyService0.multiply(3209, 51450000);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == (-661706111));
        org.junit.Assert.assertTrue(i24 == 1894292752);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(14560032, 9);
        int i18 = sumService0.add(1296581294, 918681259);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 14560041);
        org.junit.Assert.assertTrue(i18 == (-2079704743));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply((-1541019), 320);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == (-493126080));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(42, 17688);
        int i18 = sumService0.add(4224, 1328957751);
        int i21 = sumService0.add((-741196680), 377138725);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 17730);
        org.junit.Assert.assertTrue(i18 == 1328961975);
        org.junit.Assert.assertTrue(i21 == (-364057955));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(14560032, 9);
        int i18 = sumService0.add((-2081690441), (-840472364));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 14560041);
        org.junit.Assert.assertTrue(i18 == 1372804491);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(14701, (-4392));
        int i21 = multiplyService0.multiply(21632, 1759263629);
        int i24 = multiplyService0.multiply(0, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1314387328));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((-4339), 4256);
        int i12 = sumService0.add((-699588608), 2049805233);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == (-83));
        org.junit.Assert.assertTrue(i12 == 1350216625);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(1292047473, 36);
        int i18 = sumService0.add(1894292752, (-83));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == 1292047509);
        org.junit.Assert.assertTrue(i18 == 1894292669);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(14700, (int) (short) 10);
        int i9 = sumService0.add(194, 217329481);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 14710);
        org.junit.Assert.assertTrue(i9 == 217329675);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply(1470000, (int) '4');
        int i24 = multiplyService0.multiply(31, 236990600);
        int i27 = multiplyService0.multiply((-1607189544), 1350216625);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 76440000);
        org.junit.Assert.assertTrue(i24 == (-1243225992));
        org.junit.Assert.assertTrue(i27 == (-1392072616));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(51450000, (int) (byte) 10);
        int i15 = sumService0.add(318, 17730);
        int i18 = sumService0.add((-1296585613), 14700);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 51450010);
        org.junit.Assert.assertTrue(i15 == 18048);
        org.junit.Assert.assertTrue(i18 == (-1296570913));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add(47277578, (-1296581284));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == (-1249303706));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4339), 132);
        int i24 = sumService0.add(193, 276);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-4207));
        org.junit.Assert.assertTrue(i24 == 469);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add(1500648960, 700);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == 1500649660);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply(350, 147000);
        int i6 = multiplyService0.multiply(710279168, (-777639176));
        org.junit.Assert.assertTrue(i3 == 51450000);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 914894112);
        int i15 = sumService0.add(160575192, 11200);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 914894245);
        org.junit.Assert.assertTrue(i15 == 160586392);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(76440001, (-1314387328));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add((-4391), (int) (short) 0);
        int i15 = sumService0.add((-4339), 10);
        int i18 = sumService0.add((-2081677312), (-1339282954));
        int i21 = sumService0.add((-1011378815), 882521996);
        int i24 = sumService0.add(14560041, (-265));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == (-4391));
        org.junit.Assert.assertTrue(i15 == (-4329));
        org.junit.Assert.assertTrue(i18 == 874007030);
        org.junit.Assert.assertTrue(i21 == (-128856819));
        org.junit.Assert.assertTrue(i24 == 14559776);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add((-2081690441), (-827083360));
        int i27 = sumService0.add((-4402), (-1827510048));
        int i30 = sumService0.add((-4073), 165);
        int i33 = sumService0.add((-19208), (-462895099));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1386193495);
        org.junit.Assert.assertTrue(i27 == (-1827514450));
        org.junit.Assert.assertTrue(i30 == (-3908));
        org.junit.Assert.assertTrue(i33 == (-462914307));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(377157165, 1382088704);
        int i27 = sumService0.add(3720, (-1537200));
        int i30 = sumService0.add((-1652043432), 2369810);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == (-1533480));
        org.junit.Assert.assertTrue(i30 == (-1649673622));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add(3201, 14700);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == 17901);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) '4', 1);
        int i12 = sumService0.add((-1), 194);
        int i15 = sumService0.add(1045170576, 889227178);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 53);
        org.junit.Assert.assertTrue(i12 == 193);
        org.junit.Assert.assertTrue(i15 == 1934397754);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add(152, (-13281));
        int i6 = sumService0.add((-733692672), 7388160);
        org.junit.Assert.assertTrue(i3 == (-13129));
        org.junit.Assert.assertTrue(i6 == (-726304512));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(51450000, 20064);
        int i21 = multiplyService0.multiply(559150467, 1500648960);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1500648960);
        org.junit.Assert.assertTrue(i21 == 376390144);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add(36, 17724);
        int i15 = sumService0.add(1352000, 18048);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 17760);
        org.junit.Assert.assertTrue(i15 == 1370048);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add(874018230, 1290506454);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == (-2130442612));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, 818776312);
        int i15 = multiplyService0.multiply((-265), 2369842);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-628008130));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply(42, 100);
        int i27 = multiplyService0.multiply((-2081677312), (-4391));
        int i30 = multiplyService0.multiply(134, 97);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 4200);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 12998);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add(152, (-13281));
        int i6 = sumService0.add(51450000, 152);
        org.junit.Assert.assertTrue(i3 == (-13129));
        org.junit.Assert.assertTrue(i6 == 51450152);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(897633037, 377157165);
        int i15 = multiplyService0.multiply(4200, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 217329481);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(416, 1382088705);
        int i18 = sumService0.add(377138528, (int) (short) -1);
        int i21 = sumService0.add((-13312), 51450011);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 1382089121);
        org.junit.Assert.assertTrue(i18 == 377138527);
        org.junit.Assert.assertTrue(i21 == 51436699);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply(42, 100);
        int i27 = multiplyService0.multiply((-19208), 559172619);
        int i30 = multiplyService0.multiply(818780118, (-1523295));
        int i33 = multiplyService0.multiply((-1835290376), 47277578);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 4200);
        org.junit.Assert.assertTrue(i27 == 1125541544);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == 756005296);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((int) (short) 0, 31);
        int i18 = multiplyService0.multiply((-4084), 559154858);
        int i21 = multiplyService0.multiply(1457160878, 818801750);
        int i24 = multiplyService0.multiply((int) (short) 10, (-1537067));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1334161400);
        org.junit.Assert.assertTrue(i21 == (-482980236));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(1669197998, 193);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1669198191);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add(1128, 154045978);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 154047106);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((-13312), 1470000);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 1906196480);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add(97, 17724);
        int i6 = sumService0.add((-1127180196), 818775862);
        org.junit.Assert.assertTrue(i3 == 17821);
        org.junit.Assert.assertTrue(i6 == (-308404334));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(377157165, 1382088704);
        int i27 = sumService0.add(3720, (-1537200));
        int i30 = sumService0.add(18048, 0);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == (-1533480));
        org.junit.Assert.assertTrue(i30 == 18048);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-713157567), 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(134, (-1249303706));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(2604516, (-1129784712));
        int i27 = sumService0.add((-13070257), (int) (short) -1);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == (-1127180196));
        org.junit.Assert.assertTrue(i27 == (-13070258));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(3200, 9);
        int i15 = sumService0.add((-379527007), 377138528);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == (-2388479));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(416, 1382088705);
        int i18 = sumService0.add(377138528, (int) (short) -1);
        int i21 = sumService0.add(51450297, 700);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 1382089121);
        org.junit.Assert.assertTrue(i18 == 377138527);
        org.junit.Assert.assertTrue(i21 == 51450997);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(559154858, 320);
        int i21 = multiplyService0.multiply((-379527007), 1489053800);
        int i24 = multiplyService0.multiply(701, 51450297);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1459071872));
        org.junit.Assert.assertTrue(i21 == (-1546294936));
        org.junit.Assert.assertTrue(i24 == 1706919829);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(164752000, 14546853);
        int i12 = multiplyService0.multiply((-4402), 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 1309516928);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(14546853, 559154859);
        int i18 = multiplyService0.multiply((int) (byte) 1, 1489053800);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1328957751);
        org.junit.Assert.assertTrue(i18 == 1489053800);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(51450010, (-19208));
        int i18 = multiplyService0.multiply(36, 516);
        int i21 = multiplyService0.multiply(818775962, 559150539);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 18576);
        org.junit.Assert.assertTrue(i21 == 917432606);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(289796093, 1309516928);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 1599313021);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply((int) (byte) -1, 379527007);
        int i24 = multiplyService0.multiply(1706919829, 4224);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == (-379527007));
        org.junit.Assert.assertTrue(i24 == (-1220732288));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(214584351, 131);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 214584482);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(0, 914894112);
        int i21 = sumService0.add((-628008130), 377150525);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 914894112);
        org.junit.Assert.assertTrue(i21 == (-250857605));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add((-1011378815), 774557175);
        int i21 = sumService0.add(559154858, (-318));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == (-236821640));
        org.junit.Assert.assertTrue(i21 == 559154540);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((-32), 350);
        int i9 = sumService0.add((int) (short) -1, (int) (byte) 10);
        int i12 = sumService0.add((-72237792), 249110840);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 318);
        org.junit.Assert.assertTrue(i9 == 9);
        org.junit.Assert.assertTrue(i12 == 176873048);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(379527007, (-13312));
        int i21 = multiplyService0.multiply(1290506454, (-8474));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply(700, 915475213);
        int i15 = multiplyService0.multiply(0, (int) (short) -1);
        int i18 = multiplyService0.multiply((-3908), 1772188476);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 882521996);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 2069684240);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply(700, 915475213);
        int i15 = multiplyService0.multiply(296574976, (-364057955));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 882521996);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((int) '4', (int) (byte) -1);
        int i18 = multiplyService0.multiply(377138527, 4200);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-861118824));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 516);
        int i15 = sumService0.add(1, 76440000);
        int i18 = sumService0.add(1086, 42);
        int i21 = sumService0.add(142, 14560041);
        int i24 = sumService0.add(1955233, 2366108);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 548);
        org.junit.Assert.assertTrue(i15 == 76440001);
        org.junit.Assert.assertTrue(i18 == 1128);
        org.junit.Assert.assertTrue(i21 == 14560183);
        org.junit.Assert.assertTrue(i24 == 4321341);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4392), 319);
        int i12 = sumService0.add((-1077463158), 17785);
        int i15 = sumService0.add((-364057955), 1352000);
        int i18 = sumService0.add((-493126080), (-1710872314));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4073));
        org.junit.Assert.assertTrue(i12 == (-1077445373));
        org.junit.Assert.assertTrue(i15 == (-362705955));
        org.junit.Assert.assertTrue(i18 == 2090968902);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(319, 97);
        int i18 = sumService0.add(377156815, 2370192);
        int i21 = sumService0.add((-1652043432), 914908945);
        int i24 = sumService0.add(712023936, 0);
        int i27 = sumService0.add(377138725, (-1776064471));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 416);
        org.junit.Assert.assertTrue(i18 == 379527007);
        org.junit.Assert.assertTrue(i21 == (-737134487));
        org.junit.Assert.assertTrue(i24 == 712023936);
        org.junit.Assert.assertTrue(i27 == (-1398925746));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(559154859, 17760);
        int i27 = sumService0.add((-1346170880), 559154828);
        int i30 = sumService0.add(47277568, 920032939);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 559172619);
        org.junit.Assert.assertTrue(i27 == (-787016052));
        org.junit.Assert.assertTrue(i30 == 967310507);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply(712023936, 377139325);
        int i24 = multiplyService0.multiply(874018230, (int) (short) 1);
        int i27 = multiplyService0.multiply(377156815, 0);
        int i30 = multiplyService0.multiply((-1469120488), (-1296585613));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == 698737024);
        org.junit.Assert.assertTrue(i24 == 874018230);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(194, (int) '4');
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 10088);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply((-4084), 17688);
        int i18 = multiplyService0.multiply(164752000, (int) (byte) 100);
        int i21 = multiplyService0.multiply(516, 51450319);
        int i24 = multiplyService0.multiply(1080336032, (int) (short) -1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-72237792));
        org.junit.Assert.assertTrue(i18 == (-704669184));
        org.junit.Assert.assertTrue(i21 == 778560828);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(3209, 319);
        int i9 = sumService0.add((-827083360), (-1541019));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 3528);
        org.junit.Assert.assertTrue(i9 == (-828624379));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(700, 386);
        int i18 = sumService0.add((-1975096195), 217329481);
        int i21 = sumService0.add(0, (-482980236));
        int i24 = sumService0.add(266, 164752000);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1086);
        org.junit.Assert.assertTrue(i18 == (-1757766714));
        org.junit.Assert.assertTrue(i21 == (-482980236));
        org.junit.Assert.assertTrue(i24 == 164752266);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-4073), 3209);
        int i15 = multiplyService0.multiply(11200, 14710);
        int i18 = multiplyService0.multiply(3720, (-912619971));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == (-13070257));
        org.junit.Assert.assertTrue(i15 == 164752000);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply(502029312, (-4319));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((int) (short) 0, 31);
        int i18 = multiplyService0.multiply((-32), (-349672704));
        int i21 = multiplyService0.multiply(14560041, 516);
        int i24 = multiplyService0.multiply(1382088705, 14701);
        int i27 = multiplyService0.multiply(1797416241, (-1077463158));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1076953436));
        org.junit.Assert.assertTrue(i24 == (-1404225171));
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add(134, (int) (byte) 100);
        int i24 = sumService0.add(914894345, 276);
        int i27 = sumService0.add(818780118, 1474200);
        int i30 = sumService0.add((-4392), 2369874);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 234);
        org.junit.Assert.assertTrue(i24 == 914894621);
        org.junit.Assert.assertTrue(i27 == 820254318);
        org.junit.Assert.assertTrue(i30 == 2365482);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(261704448, 749371392);
        int i18 = multiplyService0.multiply(377138625, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1937768448);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(51450000, (int) (byte) 10);
        int i15 = sumService0.add(318, 17730);
        int i18 = sumService0.add(1720648459, (-912620105));
        int i21 = sumService0.add((-2388479), 20986);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 51450010);
        org.junit.Assert.assertTrue(i15 == 18048);
        org.junit.Assert.assertTrue(i18 == 808028354);
        org.junit.Assert.assertTrue(i21 == (-2367493));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(266, 17785);
        int i18 = multiplyService0.multiply(700, 3720);
        int i21 = multiplyService0.multiply(51445671, 4321341);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 4730810);
        org.junit.Assert.assertTrue(i18 == 2604000);
        org.junit.Assert.assertTrue(i21 == (-1809810741));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add(134, (int) (byte) 100);
        int i24 = sumService0.add(914894345, 276);
        int i27 = sumService0.add(1474200, (-13312));
        int i30 = sumService0.add(559154540, 17785);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 234);
        org.junit.Assert.assertTrue(i24 == 914894621);
        org.junit.Assert.assertTrue(i27 == 1460888);
        org.junit.Assert.assertTrue(i30 == 559172325);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(0, 379527007);
        int i12 = sumService0.add(3201, 42);
        int i15 = sumService0.add(1588922788, 18048);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 379527007);
        org.junit.Assert.assertTrue(i12 == 3243);
        org.junit.Assert.assertTrue(i15 == 1588940836);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply(1474200, 379504635);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1002027256));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(3200, 9);
        int i15 = sumService0.add(1797416241, (-318));
        int i18 = sumService0.add((int) (byte) 10, (-1077612260));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 1797415923);
        org.junit.Assert.assertTrue(i18 == (-1077612250));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(51450000, 20064);
        int i21 = multiplyService0.multiply(882521996, 559154858);
        int i24 = multiplyService0.multiply(1309520648, 1759245869);
        int i27 = multiplyService0.multiply(1473882, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1500648960);
        org.junit.Assert.assertTrue(i21 == (-777639176));
        org.junit.Assert.assertTrue(i24 == 1246373992);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add(11200, 154047106);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 154058306);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((-32), 350);
        int i9 = sumService0.add((int) (short) -1, (int) (byte) 10);
        int i12 = sumService0.add(134, (-13281));
        int i15 = sumService0.add((-4392), 874007030);
        int i18 = sumService0.add((-308404334), 92618432);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 318);
        org.junit.Assert.assertTrue(i9 == 9);
        org.junit.Assert.assertTrue(i12 == (-13147));
        org.junit.Assert.assertTrue(i15 == 874002638);
        org.junit.Assert.assertTrue(i18 == (-215785902));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply(350, 147000);
        int i6 = multiplyService0.multiply(1335631400, 610625987);
        org.junit.Assert.assertTrue(i3 == 51450000);
        org.junit.Assert.assertTrue(i6 == 839999608);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(3200, 559141712);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == (-1747884032));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(51450000, (int) (byte) 10);
        int i15 = sumService0.add(318, 17730);
        int i18 = sumService0.add(165, (-861118824));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 51450010);
        org.junit.Assert.assertTrue(i15 == 18048);
        org.junit.Assert.assertTrue(i18 == (-861118659));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 4200);
        int i15 = multiplyService0.multiply((-1), (-31));
        int i18 = multiplyService0.multiply((-1002027256), (-861118824));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add((-4392), (int) (byte) 1);
        int i12 = sumService0.add(818775962, (-13070257));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == (-4391));
        org.junit.Assert.assertTrue(i12 == 805705705);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '4', 416);
        int i9 = multiplyService0.multiply((-2079704743), 818775862);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 21632);
        org.junit.Assert.assertTrue(i9 == (-626325562));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply(1290506454, 165);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-1814799890));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(377157165, 1382088704);
        int i27 = sumService0.add((-912620104), 20986);
        int i30 = sumService0.add(1370048, (-1078982308));
        int i33 = sumService0.add((-1249303706), 372);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == (-912599118));
        org.junit.Assert.assertTrue(i30 == (-1077612260));
        org.junit.Assert.assertTrue(i33 == (-1249303334));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4392), 350);
        int i24 = sumService0.add(1351680, 918681259);
        int i27 = sumService0.add(1292047509, (-1077463158));
        int i30 = sumService0.add(14700, 160579584);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-4042));
        org.junit.Assert.assertTrue(i24 == 920032939);
        org.junit.Assert.assertTrue(i27 == 214584351);
        org.junit.Assert.assertTrue(i30 == 160594284);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply(1128, (-828624379));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(4200, (int) (byte) 100);
        int i15 = multiplyService0.multiply((-210011484), 17901);
        int i18 = multiplyService0.multiply(18190, (-828624379));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 420000);
        org.junit.Assert.assertTrue(i15 == (-1319191084));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply(1470000, (int) '4');
        int i24 = multiplyService0.multiply(31, 236990600);
        int i27 = multiplyService0.multiply(502029312, 2425500);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 76440000);
        org.junit.Assert.assertTrue(i24 == (-1243225992));
        org.junit.Assert.assertTrue(i27 == 1623199744);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(3209, (int) (byte) 1);
        int i15 = multiplyService0.multiply(101, 236990600);
        int i18 = multiplyService0.multiply(2369906, (-4391));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == (-1833753176));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply(145600, 20064);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == (-1373648896));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(51450010, (-19208));
        int i18 = multiplyService0.multiply(320, (-1296581284));
        int i21 = multiplyService0.multiply(653328384, (-1888865072));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(914895169, (-2142029584));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1227134415));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(0, 1352000);
        int i21 = multiplyService0.multiply((-4390), 1382088705);
        int i24 = multiplyService0.multiply((-1649673622), 1955233);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1419374298);
        org.junit.Assert.assertTrue(i24 == (-1635471702));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(2369842, (-319));
        int i21 = multiplyService0.multiply((-1827514450), 1599313021);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1779394550);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((-42210176), 145600);
        int i15 = multiplyService0.multiply(1351680, 1309516928);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 296574976);
        org.junit.Assert.assertTrue(i15 == 1624244224);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply(914908945, 51450000);
        int i18 = multiplyService0.multiply(214584351, 967310507);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 1045170576);
        org.junit.Assert.assertTrue(i18 == 1028152501);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply(502029312, (-1296578083));
        int i24 = multiplyService0.multiply(0, (-4073));
        int i27 = multiplyService0.multiply((-379527007), 154058306);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 396322690);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-1339282954), (int) ' ');
        int i15 = multiplyService0.multiply((-444431728), 904202840);
        int i18 = multiplyService0.multiply((-1296581151), 774557175);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 92618432);
        org.junit.Assert.assertTrue(i15 == (-1731821184));
        org.junit.Assert.assertTrue(i18 == 658465047);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add((-1077463158), 236990794);
        int i15 = sumService0.add(559172619, 2369842);
        int i18 = sumService0.add(1382088705, (-215785902));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == (-840472364));
        org.junit.Assert.assertTrue(i15 == 561542461);
        org.junit.Assert.assertTrue(i18 == 1166302803);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4392), 319);
        int i12 = sumService0.add((-1077463158), 17785);
        int i15 = sumService0.add((-787016052), (-1011378815));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4073));
        org.junit.Assert.assertTrue(i12 == (-1077445373));
        org.junit.Assert.assertTrue(i15 == (-1798394867));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(1894292669, 14700);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1829254332);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(700, 386);
        int i18 = sumService0.add(320, (-210011484));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1086);
        org.junit.Assert.assertTrue(i18 == (-210011164));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(14700, (int) (short) 10);
        int i9 = sumService0.add(14701, 0);
        int i12 = sumService0.add((-4207), (-1077463158));
        int i15 = sumService0.add(147000, 72908080);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 14710);
        org.junit.Assert.assertTrue(i9 == 14701);
        org.junit.Assert.assertTrue(i12 == (-1077467365));
        org.junit.Assert.assertTrue(i15 == 73055080);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(3209, 319);
        int i9 = sumService0.add(1710392717, (-1062015850));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 3528);
        org.junit.Assert.assertTrue(i9 == 648376867);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply(749371392, (-1330523392));
        int i30 = multiplyService0.multiply(133, 14701);
        int i33 = multiplyService0.multiply(1710392717, (-4402));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 1955233);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(897633037, 377157165);
        int i15 = multiplyService0.multiply(889227178, (int) (byte) -1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 217329481);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 4200);
        int i15 = multiplyService0.multiply((-1), (-31));
        int i18 = multiplyService0.multiply((-204783124), (-682497744));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((-1296581284), (-678514911));
        int i9 = sumService0.add((-13147), (int) (byte) 100);
        int i12 = sumService0.add(0, 3201);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-1975096195));
        org.junit.Assert.assertTrue(i9 == (-13047));
        org.junit.Assert.assertTrue(i12 == 3201);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-953541388), 320);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-953541068));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(1, (-32));
        int i9 = sumService0.add(160579584, (-4392));
        int i12 = sumService0.add(914908945, (-42210176));
        int i15 = sumService0.add(51436699, 1797416241);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-31));
        org.junit.Assert.assertTrue(i9 == 160575192);
        org.junit.Assert.assertTrue(i12 == 872698769);
        org.junit.Assert.assertTrue(i15 == 1848852940);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply(559154828, (int) (short) 1);
        int i15 = multiplyService0.multiply(882539781, 152);
        int i18 = multiplyService0.multiply((-1992845653), 818780118);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 559154828);
        org.junit.Assert.assertTrue(i15 == 1002060536);
        org.junit.Assert.assertTrue(i18 == 893767666);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add((-4392), (int) (byte) 1);
        int i12 = sumService0.add((-794101674), 5660160);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == (-4391));
        org.junit.Assert.assertTrue(i12 == (-788441514));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply(326142208, (-3908));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((-31), 778560828);
        org.junit.Assert.assertTrue(i3 == 778560797);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(559154859, 17760);
        int i27 = sumService0.add(882539781, (-2081690441));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 559172619);
        org.junit.Assert.assertTrue(i27 == (-1199150660));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((-678514911), 100);
        int i9 = multiplyService0.multiply((-1077612260), (-1533480));
        int i12 = multiplyService0.multiply(97, 756005296);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 867985636);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 318069680);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(53, 1);
        int i18 = multiplyService0.multiply((-1077463158), 20986);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 53);
        org.junit.Assert.assertTrue(i18 == 1360979652);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply((int) (byte) -1, 379527007);
        int i24 = multiplyService0.multiply(1030089, 325338392);
        int i27 = multiplyService0.multiply((-1469120488), 1382088704);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == (-379527007));
        org.junit.Assert.assertTrue(i24 == (-209295400));
        org.junit.Assert.assertTrue(i27 == (-1189609472));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply(420000, 5660160);
        int i15 = multiplyService0.multiply((-210011484), 7388160);
        int i18 = multiplyService0.multiply(47277568, 14560032);
        int i21 = multiplyService0.multiply(874007030, 874007030);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == (-2144681984));
        org.junit.Assert.assertTrue(i15 == 1439723520);
        org.junit.Assert.assertTrue(i18 == (-95502336));
        org.junit.Assert.assertTrue(i21 == (-478267292));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-364057955), 51450152);
        int i24 = sumService0.add((-482980236), (-861118824));
        int i27 = sumService0.add((-1077445373), 292600);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-312607803));
        org.junit.Assert.assertTrue(i24 == (-1344099060));
        org.junit.Assert.assertTrue(i27 == (-1077152773));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add((-1537200), 0);
        int i24 = sumService0.add(26497663, (-1629091072));
        int i27 = sumService0.add((-1747884032), 1700492387);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == (-1537200));
        org.junit.Assert.assertTrue(i24 == (-1602593409));
        org.junit.Assert.assertTrue(i27 == (-47391645));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(2370192, 386);
        int i24 = multiplyService0.multiply((-1), 1296581284);
        int i27 = multiplyService0.multiply(145600, (int) (byte) 100);
        int i30 = multiplyService0.multiply((-661706111), (-1075101257));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == (-1296581284));
        org.junit.Assert.assertTrue(i27 == 14560000);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(1467056384, 21632);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-149651456));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 10, 0);
        int i15 = multiplyService0.multiply(1292047473, 318);
        int i18 = multiplyService0.multiply((-1629091072), 76440001);
        int i21 = multiplyService0.multiply((-1294215043), (-953541388));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-1445764002));
        org.junit.Assert.assertTrue(i18 == 261704448);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add((-1116914032), (int) (short) 1);
        int i15 = sumService0.add((int) (short) -1, (-1008953315));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == (-1116914031));
        org.junit.Assert.assertTrue(i15 == (-1008953316));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(17785, 17730);
        int i15 = sumService0.add(1894292752, 867985636);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 35515);
        org.junit.Assert.assertTrue(i15 == (-1532688908));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(249110840, 76440000);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == (-1249959424));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add(839999608, 1624244224);
        int i24 = sumService0.add(882539781, 0);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == (-1830723464));
        org.junit.Assert.assertTrue(i24 == 882539781);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add(0, 51454210);
        int i21 = sumService0.add(53, 559154828);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == 51454210);
        org.junit.Assert.assertTrue(i21 == 559154881);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add((-2081690441), (-827083360));
        int i27 = sumService0.add((-4402), (-1827510048));
        int i30 = sumService0.add((-4361), 1500649660);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1386193495);
        org.junit.Assert.assertTrue(i27 == (-1827514450));
        org.junit.Assert.assertTrue(i30 == 1500645299);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(377139325, 11200);
        int i21 = sumService0.add(1002060536, 1420967936);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 377150525);
        org.junit.Assert.assertTrue(i21 == (-1871938824));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1129784712), 920032939);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == (-451133912));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) '4', 1);
        int i12 = sumService0.add((int) ' ', 2369874);
        int i15 = sumService0.add((-83), 897633037);
        int i18 = sumService0.add(519666606, (-1445764002));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 53);
        org.junit.Assert.assertTrue(i12 == 2369906);
        org.junit.Assert.assertTrue(i15 == 897632954);
        org.junit.Assert.assertTrue(i18 == (-926097396));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add((-4391), (int) (short) 0);
        int i15 = sumService0.add(548, 0);
        int i18 = sumService0.add(193, (-713157760));
        int i21 = sumService0.add(2425500, 1494176544);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == (-4391));
        org.junit.Assert.assertTrue(i15 == 548);
        org.junit.Assert.assertTrue(i18 == (-713157567));
        org.junit.Assert.assertTrue(i21 == 1496602044);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply(7791000, 97);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == 755727000);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-4207), 2370192);
        int i12 = multiplyService0.multiply(1290506454, 2090968902);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1381463152));
        org.junit.Assert.assertTrue(i12 == 1920676996);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4339), 132);
        int i24 = sumService0.add(11904, (-19208));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-4207));
        org.junit.Assert.assertTrue(i24 == (-7304));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add((int) (byte) 10, 266);
        int i15 = sumService0.add((int) (short) 1, 3200);
        int i18 = sumService0.add((-1541019), 17724);
        int i21 = sumService0.add((-4084), (-4390));
        int i24 = sumService0.add(377138527, 2366108);
        int i27 = sumService0.add(2425500, 17688);
        int i30 = sumService0.add(893767666, 152);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 276);
        org.junit.Assert.assertTrue(i15 == 3201);
        org.junit.Assert.assertTrue(i18 == (-1523295));
        org.junit.Assert.assertTrue(i21 == (-8474));
        org.junit.Assert.assertTrue(i24 == 379504635);
        org.junit.Assert.assertTrue(i27 == 2443188);
        org.junit.Assert.assertTrue(i30 == 893767818);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(3201, 774557175);
        int i18 = multiplyService0.multiply((-2388479), 0);
        int i21 = multiplyService0.multiply((-209295400), (-1757766714));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1161387383);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(318, (int) (byte) 1);
        int i15 = sumService0.add(51450319, 17688);
        int i18 = sumService0.add((-1629091072), 51450152);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 319);
        org.junit.Assert.assertTrue(i15 == 51468007);
        org.junit.Assert.assertTrue(i18 == (-1577640920));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply(249110840, 14560000);
        int i15 = multiplyService0.multiply(1128, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 1193568256);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply(1296581284, (int) (short) 1);
        int i15 = multiplyService0.multiply(53, 147000);
        int i18 = multiplyService0.multiply(559150539, 51450010);
        int i21 = multiplyService0.multiply(53, (-1969079032));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 7791000);
        org.junit.Assert.assertTrue(i18 == (-10908642));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(700, 386);
        int i18 = sumService0.add((-1975096195), 217329481);
        int i21 = sumService0.add(0, (-482980236));
        int i24 = sumService0.add((-13312), (-4207));
        int i27 = sumService0.add((-42210176), (-1523295));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1086);
        org.junit.Assert.assertTrue(i18 == (-1757766714));
        org.junit.Assert.assertTrue(i21 == (-482980236));
        org.junit.Assert.assertTrue(i24 == (-17519));
        org.junit.Assert.assertTrue(i27 == (-43733471));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(379527007, (-13312));
        int i21 = multiplyService0.multiply(1089162661, 1772188476);
        int i24 = multiplyService0.multiply((-1314386780), 648376867);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1825329580);
        org.junit.Assert.assertTrue(i24 == (-1655782804));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-72237792), 559154858);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 2096518976);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add(134, (int) (byte) 100);
        int i24 = sumService0.add(914894345, 276);
        int i27 = sumService0.add(160575202, 14559776);
        int i30 = sumService0.add((-678514911), 1588922788);
        int i33 = sumService0.add(914908945, (int) (short) 10);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 234);
        org.junit.Assert.assertTrue(i24 == 914894621);
        org.junit.Assert.assertTrue(i27 == 175134978);
        org.junit.Assert.assertTrue(i30 == 910407877);
        org.junit.Assert.assertTrue(i33 == 914908955);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 1, 236990600);
        int i15 = multiplyService0.multiply(292600, (int) (byte) -1);
        int i18 = multiplyService0.multiply((-831258624), (-713157760));
        int i21 = multiplyService0.multiply((-1629479311), 51454210);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 2049822178);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(2369842, (-319));
        int i21 = multiplyService0.multiply((-4361), (-787016052));
        int i24 = multiplyService0.multiply((-1077612260), (-678514911));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(920032939, 11904);
        int i18 = multiplyService0.multiply(818776312, 1894292752);
        int i21 = multiplyService0.multiply(1848852940, 17760);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-94498944));
        org.junit.Assert.assertTrue(i18 == (-1164400768));
        org.junit.Assert.assertTrue(i21 == 603236480);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(1292047473, 36);
        int i18 = sumService0.add(31, (int) (short) 1);
        int i21 = sumService0.add(51454210, (-308404334));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == 1292047509);
        org.junit.Assert.assertTrue(i18 == 32);
        org.junit.Assert.assertTrue(i21 == (-256950124));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply(420000, 5660160);
        int i15 = multiplyService0.multiply((-210011484), 7388160);
        int i18 = multiplyService0.multiply(47277568, 14560032);
        int i21 = multiplyService0.multiply((-699588608), 1125541544);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == (-2144681984));
        org.junit.Assert.assertTrue(i15 == 1439723520);
        org.junit.Assert.assertTrue(i18 == (-95502336));
        org.junit.Assert.assertTrue(i21 == 492634112);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(17842176, (-699588608));
        int i15 = sumService0.add(319, 502029312);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == (-681746432));
        org.junit.Assert.assertTrue(i15 == 502029631);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply(420000, 5660160);
        int i15 = multiplyService0.multiply((-210011484), 7388160);
        int i18 = multiplyService0.multiply((-1536935), 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == (-2144681984));
        org.junit.Assert.assertTrue(i15 == 1439723520);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply(3200, 0);
        int i21 = multiplyService0.multiply((-210011484), (int) ' ');
        int i24 = multiplyService0.multiply(1334161400, (-4402));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1869567104);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-4207), 2370192);
        int i12 = multiplyService0.multiply((-1077467365), 379527007);
        int i15 = multiplyService0.multiply(51468007, 1839793749);
        int i18 = multiplyService0.multiply((-2083597203), 1706919829);
        int i21 = multiplyService0.multiply((-319), 154047106);
        int i24 = multiplyService0.multiply(1923399140, 17901);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1381463152));
        org.junit.Assert.assertTrue(i12 == (-462895099));
        org.junit.Assert.assertTrue(i15 == 642401459);
        org.junit.Assert.assertTrue(i18 == (-1629479311));
        org.junit.Assert.assertTrue(i21 == (-1896386558));
        org.junit.Assert.assertTrue(i24 == (-1984806892));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply(1419374298, (-128856819));
        int i6 = multiplyService0.multiply((-1652043432), (-2081677312));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(2370192, 386);
        int i24 = multiplyService0.multiply(1885806912, 74903400);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == 1164984832);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(261704448, 749371392);
        int i18 = multiplyService0.multiply((-912599118), 14833);
        int i21 = multiplyService0.multiply(17731, 14560000);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1937768448);
        org.junit.Assert.assertTrue(i18 == 1154199698);
        org.junit.Assert.assertTrue(i21 == 465322240);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add(236990794, 4256);
        int i21 = sumService0.add(1256719959, (-19208));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 236995050);
        org.junit.Assert.assertTrue(i21 == 1256700751);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply(3200, 0);
        int i21 = multiplyService0.multiply(296570614, 700);
        int i24 = multiplyService0.multiply(132, 17760);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1440999592);
        org.junit.Assert.assertTrue(i24 == 2344320);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((-912619971), 17688);
        int i15 = multiplyService0.multiply((-628008130), 1125541544);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == (-1934948680));
        org.junit.Assert.assertTrue(i15 == 1796379824);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(377139325, 11200);
        int i21 = sumService0.add(1328957751, (-72237792));
        int i24 = sumService0.add(101, 1829254332);
        int i27 = sumService0.add(3201, (-1346170880));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 377150525);
        org.junit.Assert.assertTrue(i21 == 1256719959);
        org.junit.Assert.assertTrue(i24 == 1829254433);
        org.junit.Assert.assertTrue(i27 == (-1346167679));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply(372, 76440000);
        int i15 = multiplyService0.multiply((-94498944), (-1635471702));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == (-1629091072));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(318, (int) (byte) 1);
        int i15 = sumService0.add(51450319, 17688);
        int i18 = sumService0.add(14560041, 194);
        int i21 = sumService0.add((-788441514), 1309523891);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 319);
        org.junit.Assert.assertTrue(i15 == 51468007);
        org.junit.Assert.assertTrue(i18 == 14560235);
        org.junit.Assert.assertTrue(i21 == 521082377);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((-13147), 1419374298);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1419361151);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply(700, 915475213);
        int i15 = multiplyService0.multiply(2365873, 914894112);
        int i18 = multiplyService0.multiply((-1498897379), 918681227);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 882521996);
        org.junit.Assert.assertTrue(i15 == 1494176544);
        org.junit.Assert.assertTrue(i18 == 1663171007);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 100, 914908945);
        int i15 = multiplyService0.multiply(101, (-1652043432));
        int i18 = multiplyService0.multiply(17760, 416);
        int i21 = multiplyService0.multiply((-1975096195), (-72237792));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 7388160);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((int) ' ', 14560000);
        int i18 = sumService0.add(372, (int) (short) 1);
        int i21 = sumService0.add(386, 774556789);
        int i24 = sumService0.add(377150525, (int) ' ');
        int i27 = sumService0.add(0, 1309520648);
        int i30 = sumService0.add((-1706330015), 0);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 14560032);
        org.junit.Assert.assertTrue(i18 == 373);
        org.junit.Assert.assertTrue(i21 == 774557175);
        org.junit.Assert.assertTrue(i24 == 377150557);
        org.junit.Assert.assertTrue(i27 == 1309520648);
        org.junit.Assert.assertTrue(i30 == (-1706330015));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply(1470000, (int) '4');
        int i24 = multiplyService0.multiply(31, 236990600);
        int i27 = multiplyService0.multiply(749034, (-1011378815));
        int i30 = multiplyService0.multiply((int) (byte) 10, (-1199150660));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 76440000);
        org.junit.Assert.assertTrue(i24 == (-1243225992));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply(236990600, 51449979);
        int i21 = multiplyService0.multiply((-1084340254), 1623199744);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == (-1652043432));
        org.junit.Assert.assertTrue(i21 == (-1912725504));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((int) (short) 0, 31);
        int i18 = multiplyService0.multiply((-4084), 559154858);
        int i21 = multiplyService0.multiply(1457160878, 818801750);
        int i24 = multiplyService0.multiply(377138725, 134);
        int i27 = multiplyService0.multiply((-1912725504), (-953541068));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1334161400);
        org.junit.Assert.assertTrue(i21 == (-482980236));
        org.junit.Assert.assertTrue(i24 == (-1003018402));
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1470000, 1334161400);
        int i15 = sumService0.add(1885806912, 1708098459);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1335631400);
        org.junit.Assert.assertTrue(i15 == (-701061925));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply((-4084), 1620577792);
        int i24 = multiplyService0.multiply(1885806912, 10);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == 104900608);
        org.junit.Assert.assertTrue(i24 == 1678199936);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply(4256, 1370048);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1535956992);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add((-2081690441), (-827083360));
        int i27 = sumService0.add((-4402), (-1827510048));
        int i30 = sumService0.add(1494176544, 818776312);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1386193495);
        org.junit.Assert.assertTrue(i27 == (-1827514450));
        org.junit.Assert.assertTrue(i30 == (-1982014440));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(0, 3201);
        int i21 = sumService0.add(194, 236990600);
        int i24 = sumService0.add((-32), 2369842);
        int i27 = sumService0.add((-1827514450), (-1398925746));
        int i30 = sumService0.add(1334161400, (int) 'a');
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 3201);
        org.junit.Assert.assertTrue(i21 == 236990794);
        org.junit.Assert.assertTrue(i24 == 2369810);
        org.junit.Assert.assertTrue(i27 == 1068527100);
        org.junit.Assert.assertTrue(i30 == 1334161497);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(180900992, 1761760944);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == 1942661936);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 100, 914908945);
        int i15 = multiplyService0.multiply(101, (-1652043432));
        int i18 = multiplyService0.multiply(17760, 416);
        int i21 = multiplyService0.multiply(74903400, 920032939);
        int i24 = multiplyService0.multiply((-1827510048), (-1249303334));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 7388160);
        org.junit.Assert.assertTrue(i21 == (-1129784712));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(326142208, 559150467);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 885292675);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (short) 1, 10);
        int i12 = multiplyService0.multiply(154058306, 1309517028);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == (-455230776));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(416, 1382088705);
        int i18 = sumService0.add(377138528, (int) (short) -1);
        int i21 = sumService0.add(17688, 363756358);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 1382089121);
        org.junit.Assert.assertTrue(i18 == 377138527);
        org.junit.Assert.assertTrue(i21 == 363774046);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(51450010, (-19208));
        int i18 = multiplyService0.multiply(320, (-1296581284));
        int i21 = multiplyService0.multiply(373, 749034);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 279389682);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 1, 236990600);
        int i15 = multiplyService0.multiply(51450011, (-4319));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(3200, 9);
        int i15 = sumService0.add(154047299, (-1249959424));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == (-1095912125));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add((int) (byte) 0, 17785);
        int i21 = sumService0.add((-810310954), 0);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 17785);
        org.junit.Assert.assertTrue(i21 == (-810310954));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add(234, 0);
        int i24 = sumService0.add(1309520648, (-1532688908));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == 234);
        org.junit.Assert.assertTrue(i24 == (-223168260));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 4200);
        int i15 = multiplyService0.multiply((-1), (-31));
        int i18 = multiplyService0.multiply(1848852940, (-4319));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (short) 1, 10);
        int i12 = multiplyService0.multiply((-455230776), (-628008130));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(51450000, (int) (byte) 10);
        int i15 = sumService0.add(318, 17730);
        int i18 = sumService0.add((-13281), (-83));
        int i21 = sumService0.add(778560797, (-762612983));
        int i24 = sumService0.add(2366108, 0);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 51450010);
        org.junit.Assert.assertTrue(i15 == 18048);
        org.junit.Assert.assertTrue(i18 == (-13364));
        org.junit.Assert.assertTrue(i21 == 15947814);
        org.junit.Assert.assertTrue(i24 == 2366108);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(0, 3201);
        int i21 = sumService0.add(194, 236990600);
        int i24 = sumService0.add(4224, 0);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 3201);
        org.junit.Assert.assertTrue(i21 == 236990794);
        org.junit.Assert.assertTrue(i24 == 4224);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((int) ' ', 14560000);
        int i18 = sumService0.add(372, (int) (short) 1);
        int i21 = sumService0.add(386, 774556789);
        int i24 = sumService0.add((-762612983), 420000);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 14560032);
        org.junit.Assert.assertTrue(i18 == 373);
        org.junit.Assert.assertTrue(i21 == 774557175);
        org.junit.Assert.assertTrue(i24 == (-762192983));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(100, 416);
        int i15 = sumService0.add(914908945, (-1635471702));
        int i18 = sumService0.add(377139325, 882539781);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 516);
        org.junit.Assert.assertTrue(i15 == (-720562757));
        org.junit.Assert.assertTrue(i18 == 1259679106);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(1, (-32));
        int i9 = sumService0.add(160579584, (-4392));
        int i12 = sumService0.add((-4319), 559154858);
        int i15 = sumService0.add((-150844453), (-258687196));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-31));
        org.junit.Assert.assertTrue(i9 == 160575192);
        org.junit.Assert.assertTrue(i12 == 559150539);
        org.junit.Assert.assertTrue(i15 == (-409531649));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add(1309516928, (int) (byte) 100);
        int i18 = sumService0.add(1759245869, 519666606);
        int i21 = sumService0.add((-840472364), (-1095912125));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1309517028);
        org.junit.Assert.assertTrue(i18 == (-2016054821));
        org.junit.Assert.assertTrue(i21 == (-1936384489));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(100, 0);
        int i21 = multiplyService0.multiply((-953556088), 193);
        int i24 = multiplyService0.multiply(51450011, 1166302803);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 647268744);
        org.junit.Assert.assertTrue(i24 == (-1718793151));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(51449979, (-1827514450));
        int i9 = sumService0.add((-1314386780), (-4073));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == (-1776064471));
        org.junit.Assert.assertTrue(i9 == (-1314390853));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-364057955), 51450152);
        int i24 = sumService0.add((-1127180196), 1839793749);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-312607803));
        org.junit.Assert.assertTrue(i24 == 712613553);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(92618432, (-1220732288));
        int i21 = multiplyService0.multiply((-7304), 778560828);
        int i24 = multiplyService0.multiply((-8464), 1588940836);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-71587808));
        org.junit.Assert.assertTrue(i24 == (-1252632128));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(18048, 1348052926);
        int i21 = multiplyService0.multiply((int) (byte) -1, 778560828);
        int i24 = multiplyService0.multiply(0, (-900025667));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1330523392));
        org.junit.Assert.assertTrue(i21 == (-778560828));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(0, 379527007);
        int i12 = sumService0.add(3201, 42);
        int i15 = sumService0.add((-953541068), 1920794624);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 379527007);
        org.junit.Assert.assertTrue(i12 == 3243);
        org.junit.Assert.assertTrue(i15 == 967253556);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) '4', 1);
        int i12 = sumService0.add((-1296581151), 375605048);
        int i15 = sumService0.add((-1398925746), 377138625);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 53);
        org.junit.Assert.assertTrue(i12 == (-920976103));
        org.junit.Assert.assertTrue(i15 == (-1021787121));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply((int) (byte) 0, 1474200);
        int i21 = multiplyService0.multiply((-4329), (-861118659));
        int i24 = multiplyService0.multiply((int) 'a', 897632954);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 1171050618);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(67247920, 5660160);
        int i18 = sumService0.add(1474200, (int) '#');
        int i21 = sumService0.add((int) 'a', 502029312);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == 72908080);
        org.junit.Assert.assertTrue(i18 == 1474235);
        org.junit.Assert.assertTrue(i21 == 502029409);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(874007030, 32);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 874007062);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply(0, (-1227134415));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add((-1296578083), 0);
        int i21 = sumService0.add(0, 1419361151);
        int i24 = sumService0.add((-794101674), (-1077445373));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == (-1296578083));
        org.junit.Assert.assertTrue(i21 == 1419361151);
        org.junit.Assert.assertTrue(i24 == (-1871547047));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(559154858, 320);
        int i21 = multiplyService0.multiply(14833, 1382089355);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1459071872));
        org.junit.Assert.assertTrue(i21 == 652498907);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((int) (short) 0, 31);
        int i18 = multiplyService0.multiply((-32), (-349672704));
        int i21 = multiplyService0.multiply(14560041, 516);
        int i24 = multiplyService0.multiply(1382088705, 14701);
        int i27 = multiplyService0.multiply((-1346167679), (-661706111));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1076953436));
        org.junit.Assert.assertTrue(i24 == (-1404225171));
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((-32), 350);
        int i9 = sumService0.add((int) (short) -1, (int) (byte) 10);
        int i12 = sumService0.add(134, (-13281));
        int i15 = sumService0.add((-1084487254), 147000);
        int i18 = sumService0.add(1759245869, 379527007);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 318);
        org.junit.Assert.assertTrue(i9 == 9);
        org.junit.Assert.assertTrue(i12 == (-13147));
        org.junit.Assert.assertTrue(i15 == (-1084340254));
        org.junit.Assert.assertTrue(i18 == 2138772876);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(559154858, 320);
        int i21 = multiplyService0.multiply(0, (-827083360));
        int i24 = multiplyService0.multiply(249110840, (-713157760));
        int i27 = multiplyService0.multiply((-704669184), (-265));
        int i30 = multiplyService0.multiply((-343474176), (-83));
        int i33 = multiplyService0.multiply((-1710872314), 321);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1459071872));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == 565801094);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(100, 914894245);
        int i21 = sumService0.add(31, (-4392));
        int i24 = sumService0.add((-72237792), 133);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 914894345);
        org.junit.Assert.assertTrue(i21 == (-4361));
        org.junit.Assert.assertTrue(i24 == (-72237659));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-13312), 31);
        int i24 = sumService0.add((-1129784712), 1460888);
        int i27 = sumService0.add(457171164, 296570614);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-13281));
        org.junit.Assert.assertTrue(i24 == (-1128323824));
        org.junit.Assert.assertTrue(i27 == 753741778);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((-678514911), 100);
        int i9 = multiplyService0.multiply(774557175, (-726304512));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 867985636);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply((-318), 882521996);
        int i21 = multiplyService0.multiply(3209, 918681227);
        int i24 = multiplyService0.multiply(1920794624, 1489053800);
        int i27 = multiplyService0.multiply(915475213, 377154280);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == (-1469120488));
        org.junit.Assert.assertTrue(i21 == 1700492387);
        org.junit.Assert.assertTrue(i24 == 180879360);
        org.junit.Assert.assertTrue(i27 == 1774052808);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(36, 17688);
        int i21 = sumService0.add((-1392072616), (int) (short) -1);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 17724);
        org.junit.Assert.assertTrue(i21 == (-1392072617));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 516);
        int i15 = sumService0.add((-704669184), 0);
        int i18 = sumService0.add(176873048, 1328957751);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 548);
        org.junit.Assert.assertTrue(i15 == (-704669184));
        org.junit.Assert.assertTrue(i18 == 1505830799);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(0, (-1607189544));
        int i15 = sumService0.add((-6774564), (-90282413));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == (-1607189544));
        org.junit.Assert.assertTrue(i15 == (-97056977));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((-1296581284), (-678514911));
        int i9 = sumService0.add((-13147), (int) (byte) 100);
        int i12 = sumService0.add(1500648960, 1894292669);
        int i15 = sumService0.add(18576, 20986);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-1975096195));
        org.junit.Assert.assertTrue(i9 == (-13047));
        org.junit.Assert.assertTrue(i12 == (-900025667));
        org.junit.Assert.assertTrue(i15 == 39562);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply(1669198191, 290088693);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == (-1898952389));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply(4256, 11937480);
        int i18 = multiplyService0.multiply(2046336526, (-708836419));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == (-733692672));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-1), (-4392));
        int i12 = multiplyService0.multiply((-493126080), (-318));
        int i15 = multiplyService0.multiply((-1406278947), 376390144);
        int i18 = multiplyService0.multiply((-741196680), 296574976);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 810547712);
        org.junit.Assert.assertTrue(i18 == (-1413152768));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply((int) (byte) -1, 379527007);
        int i24 = multiplyService0.multiply(1759245869, 2049805233);
        int i27 = multiplyService0.multiply(32, (-912620104));
        int i30 = multiplyService0.multiply(0, (-4392));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == (-379527007));
        org.junit.Assert.assertTrue(i24 == (-1498897379));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(14701, (-4392));
        int i21 = multiplyService0.multiply((-1), 818780118);
        int i24 = multiplyService0.multiply(1920794624, 236990600);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-818780118));
        org.junit.Assert.assertTrue(i24 == 1114112000);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(51450000, 20064);
        int i21 = multiplyService0.multiply(914908945, (-1541019));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1500648960);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add((-4392), (int) (byte) 1);
        int i12 = sumService0.add((-13129), (-2081677312));
        int i15 = sumService0.add(647268744, 18048);
        int i18 = sumService0.add((-1398925746), 14560183);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == (-4391));
        org.junit.Assert.assertTrue(i12 == (-2081690441));
        org.junit.Assert.assertTrue(i15 == 647286792);
        org.junit.Assert.assertTrue(i18 == (-1384365563));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(51450000, (int) (byte) 10);
        int i15 = sumService0.add(318, 17730);
        int i18 = sumService0.add(710279168, (-1296570913));
        int i21 = sumService0.add((-1335626144), (-629524947));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 51450010);
        org.junit.Assert.assertTrue(i15 == 18048);
        org.junit.Assert.assertTrue(i18 == (-586291745));
        org.junit.Assert.assertTrue(i21 == (-1965151091));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply(1873693507, 1916619352);
        int i24 = multiplyService0.multiply((int) (short) 1, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == (-1969079032));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((-32), 350);
        int i9 = sumService0.add((int) (short) -1, (int) (byte) 10);
        int i12 = sumService0.add(18048, 142);
        int i15 = sumService0.add(465322240, 0);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 318);
        org.junit.Assert.assertTrue(i9 == 9);
        org.junit.Assert.assertTrue(i12 == 18190);
        org.junit.Assert.assertTrue(i15 == 465322240);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(1, (int) (short) 10);
        int i15 = multiplyService0.multiply((-265), (-794101674));
        int i18 = multiplyService0.multiply(14560235, 47277578);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1057511726);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((-42210176), 145600);
        int i15 = multiplyService0.multiply(559154858, 820254318);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 296574976);
        org.junit.Assert.assertTrue(i15 == 1511356684);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(4200, (int) (byte) 0);
        int i18 = multiplyService0.multiply((-6778883), 236990600);
        int i21 = multiplyService0.multiply((-1335626144), (-349672704));
        int i24 = multiplyService0.multiply(17842176, 3209);
        int i27 = multiplyService0.multiply(236995050, 236995050);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 967569000);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 1420967936);
        org.junit.Assert.assertTrue(i27 == 595110372);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(559154859, 17760);
        int i27 = sumService0.add(1292047509, 1259679106);
        int i30 = sumService0.add(882539781, 0);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 559172619);
        org.junit.Assert.assertTrue(i27 == (-1743240681));
        org.junit.Assert.assertTrue(i30 == 882539781);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(0, 160586392);
        int i18 = multiplyService0.multiply((-1373648896), (-699588608));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(17785, 17730);
        int i15 = sumService0.add((int) (short) 1, 160575192);
        int i18 = sumService0.add(565801094, 51471642);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 35515);
        org.junit.Assert.assertTrue(i15 == 160575193);
        org.junit.Assert.assertTrue(i18 == 617272736);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-364057955), 51450152);
        int i24 = sumService0.add(296574976, (-6778883));
        int i27 = sumService0.add((-778560828), 3209);
        int i30 = sumService0.add(363756358, (-485898434));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-312607803));
        org.junit.Assert.assertTrue(i24 == 289796093);
        org.junit.Assert.assertTrue(i27 == (-778557619));
        org.junit.Assert.assertTrue(i30 == (-122142076));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(14700, (int) (short) 10);
        int i9 = sumService0.add(14701, 0);
        int i12 = sumService0.add((-4207), (-1077463158));
        int i15 = sumService0.add((-2144681984), (-4207));
        int i18 = sumService0.add((-1629091072), 14560041);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 14710);
        org.junit.Assert.assertTrue(i9 == 14701);
        org.junit.Assert.assertTrue(i12 == (-1077467365));
        org.junit.Assert.assertTrue(i15 == (-2144686191));
        org.junit.Assert.assertTrue(i18 == (-1614531031));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(1, (int) (short) 10);
        int i15 = multiplyService0.multiply(236995050, 700);
        int i18 = multiplyService0.multiply(1382088704, 51468007);
        int i21 = multiplyService0.multiply((-1523295), (-478267292));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == (-1607189544));
        org.junit.Assert.assertTrue(i18 == (-343474176));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(4200, (int) (byte) 0);
        int i18 = multiplyService0.multiply((-1710872314), 2369874);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 392370668);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(882521996, 17785);
        int i15 = sumService0.add(0, (-8474));
        int i18 = sumService0.add(648376867, 1772188476);
        int i21 = sumService0.add(2365482, 0);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 882539781);
        org.junit.Assert.assertTrue(i15 == (-8474));
        org.junit.Assert.assertTrue(i18 == (-1874401953));
        org.junit.Assert.assertTrue(i21 == 2365482);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add(2604516, 1920794624);
        int i18 = sumService0.add(3492, 1863708879);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1923399140);
        org.junit.Assert.assertTrue(i18 == 1863712371);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4339), 132);
        int i24 = sumService0.add((-4361), (-1));
        int i27 = sumService0.add(1305542656, 1309517028);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-4207));
        org.junit.Assert.assertTrue(i24 == (-4362));
        org.junit.Assert.assertTrue(i27 == (-1679907612));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(1839793749, 18190);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 1839811939);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((-94498944), 1419374298);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-368954624));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(897633037, 17842176);
        int i15 = sumService0.add(319, 559172619);
        int i18 = sumService0.add((-1827510048), 778560828);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 915475213);
        org.junit.Assert.assertTrue(i15 == 559172938);
        org.junit.Assert.assertTrue(i18 == (-1048949220));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply(749371392, (-1330523392));
        int i30 = multiplyService0.multiply((-308404334), 296570614);
        int i33 = multiplyService0.multiply(0, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == (-1959079348));
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 1, 236990600);
        int i15 = multiplyService0.multiply((-827083360), 31);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == 130219616);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply((int) (byte) -1, 379527007);
        int i24 = multiplyService0.multiply((-1339282954), 0);
        int i27 = multiplyService0.multiply(1848852940, (-1984806892));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == (-379527007));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply(236990600, 51449979);
        int i21 = multiplyService0.multiply(914894112, (-1220810752));
        int i24 = multiplyService0.multiply((-828353057), (-258687196));
        int i27 = multiplyService0.multiply(1955233, (-1537067));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == (-1652043432));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add((-4391), (int) (short) 0);
        int i15 = sumService0.add(548, 0);
        int i18 = sumService0.add((-1498897379), (-1406278947));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == (-4391));
        org.junit.Assert.assertTrue(i15 == 548);
        org.junit.Assert.assertTrue(i18 == 1389790970);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply(4256, 11937480);
        int i18 = multiplyService0.multiply((-1314386780), (-150844453));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == (-733692672));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply((-32), 416);
        int i24 = multiplyService0.multiply(276, 296570614);
        int i27 = multiplyService0.multiply(377154280, 658465047);
        int i30 = multiplyService0.multiply(1382089121, 4200);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 249110840);
        org.junit.Assert.assertTrue(i27 == (-1088093480));
        org.junit.Assert.assertTrue(i30 == (-2021475992));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (byte) -1, 0);
        int i15 = multiplyService0.multiply(1772188476, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply(42, 100);
        int i27 = multiplyService0.multiply((-2081677312), (-4391));
        int i30 = multiplyService0.multiply((-1294215043), (-1947786240));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 4200);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(700, 386);
        int i18 = sumService0.add((-1975096195), 1212483212);
        int i21 = sumService0.add((-451133912), 1296581294);
        int i24 = sumService0.add(394431477, (-318));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1086);
        org.junit.Assert.assertTrue(i18 == (-762612983));
        org.junit.Assert.assertTrue(i21 == 845447382);
        org.junit.Assert.assertTrue(i24 == 394431159);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(164752000, 14546853);
        int i12 = multiplyService0.multiply(0, 914894112);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 1309516928);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(53, 1);
        int i18 = multiplyService0.multiply(377157165, 1296581294);
        int i21 = multiplyService0.multiply(1382089355, (-318));
        int i24 = multiplyService0.multiply(808028354, (-778570983));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 53);
        org.junit.Assert.assertTrue(i18 == (-1062015850));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add((-1652043432), (-629524947));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == 2013398917);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add(867985636, (-762612983));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == 105372653);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(559154858, 320);
        int i21 = multiplyService0.multiply(0, (-827083360));
        int i24 = multiplyService0.multiply(203, 160594284);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1459071872));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == (-1759098716));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply(468779008, (-1243225992));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply((int) (byte) 0, 1474200);
        int i21 = multiplyService0.multiply(9, (-13281));
        int i24 = multiplyService0.multiply(0, 47277568);
        int i27 = multiplyService0.multiply(76440000, (-13129));
        int i30 = multiplyService0.multiply((-1398925746), (-629524947));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(1, (int) (short) 10);
        int i15 = multiplyService0.multiply(236995050, 700);
        int i18 = multiplyService0.multiply(377150557, (-1776061271));
        int i21 = multiplyService0.multiply(778560797, (-1314390853));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == (-1607189544));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 1, 236990600);
        int i15 = multiplyService0.multiply(292600, (int) (byte) -1);
        int i18 = multiplyService0.multiply(1125541544, (-13312));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add(132, (-1537067));
        int i18 = sumService0.add((-318), 53);
        int i21 = sumService0.add(1761760944, (-1008953315));
        int i24 = sumService0.add(648376867, 1382089355);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == (-1536935));
        org.junit.Assert.assertTrue(i18 == (-265));
        org.junit.Assert.assertTrue(i21 == 752807629);
        org.junit.Assert.assertTrue(i24 == 2030466222);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply(0, 1700492387);
        int i15 = multiplyService0.multiply(1922224165, 559141712);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 275679888);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-4207), 2370192);
        int i12 = multiplyService0.multiply((-1077467365), 379527007);
        int i15 = multiplyService0.multiply(51468007, 1839793749);
        int i18 = multiplyService0.multiply(180900992, 2096518976);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1381463152));
        org.junit.Assert.assertTrue(i12 == (-462895099));
        org.junit.Assert.assertTrue(i15 == 642401459);
        org.junit.Assert.assertTrue(i18 == (-104030208));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(700, 386);
        int i18 = sumService0.add((-1975096195), 217329481);
        int i21 = sumService0.add(0, (-482980236));
        int i24 = sumService0.add((-1498897379), 51450997);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1086);
        org.junit.Assert.assertTrue(i18 == (-1757766714));
        org.junit.Assert.assertTrue(i21 == (-482980236));
        org.junit.Assert.assertTrue(i24 == (-1447446382));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(377139325, 11200);
        int i21 = sumService0.add(1328957751, (-72237792));
        int i24 = sumService0.add(2013398917, 152);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 377150525);
        org.junit.Assert.assertTrue(i21 == 1256719959);
        org.junit.Assert.assertTrue(i24 == 2013399069);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4392), 319);
        int i12 = sumService0.add((-1077463158), 17785);
        int i15 = sumService0.add((-364057955), 1352000);
        int i18 = sumService0.add(893767666, 559172938);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4073));
        org.junit.Assert.assertTrue(i12 == (-1077445373));
        org.junit.Assert.assertTrue(i15 == (-362705955));
        org.junit.Assert.assertTrue(i18 == 1452940604);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add((-478267292), 872698769);
        int i15 = sumService0.add((int) (byte) 10, 3209);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == 394431477);
        org.junit.Assert.assertTrue(i15 == 3219);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply(1296581284, (int) (short) 1);
        int i15 = multiplyService0.multiply(53, 147000);
        int i18 = multiplyService0.multiply(17785, 72908213);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 7791000);
        org.junit.Assert.assertTrue(i18 == (-407555187));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply((-318), 882521996);
        int i21 = multiplyService0.multiply(2370192, 874007030);
        int i24 = multiplyService0.multiply(1706919829, (-95502336));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == (-1469120488));
        org.junit.Assert.assertTrue(i21 == (-1335626144));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4392), 350);
        int i24 = sumService0.add(1351680, 918681259);
        int i27 = sumService0.add(1335631400, 818775862);
        int i30 = sumService0.add((-1912725504), (-711503682));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-4042));
        org.junit.Assert.assertTrue(i24 == 920032939);
        org.junit.Assert.assertTrue(i27 == (-2140560034));
        org.junit.Assert.assertTrue(i30 == 1670738110);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add(134, (int) (byte) 100);
        int i24 = sumService0.add(914894345, 276);
        int i27 = sumService0.add(818780118, 1474200);
        int i30 = sumService0.add(1467056384, (-236821640));
        int i33 = sumService0.add(1328961975, 472092032);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 234);
        org.junit.Assert.assertTrue(i24 == 914894621);
        org.junit.Assert.assertTrue(i27 == 820254318);
        org.junit.Assert.assertTrue(i30 == 1230234744);
        org.junit.Assert.assertTrue(i33 == 1801054007);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(17785, 17730);
        int i15 = sumService0.add(1906196480, 559172325);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 35515);
        org.junit.Assert.assertTrue(i15 == (-1829598491));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(1351680, 915475213);
        int i12 = multiplyService0.multiply((-1827510048), (-661706111));
        int i15 = multiplyService0.multiply((-128856819), (-1095952965));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-2081677312));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(379527007, (-13312));
        int i21 = multiplyService0.multiply(1588940836, (int) (byte) -1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((int) (short) 0, 31);
        int i18 = multiplyService0.multiply((-32), (-349672704));
        int i21 = multiplyService0.multiply(1922224165, 1678199936);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 70651520);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 1, 236990600);
        int i15 = multiplyService0.multiply(502029631, (int) '#');
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == 391167901);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply(465322240, (int) ' ');
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 2005409792);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 701);
        int i15 = multiplyService0.multiply((-1084340254), 1427127348);
        int i18 = multiplyService0.multiply((-1994915840), 1588940836);
        int i21 = multiplyService0.multiply(0, (-1314390853));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-2145414680));
        org.junit.Assert.assertTrue(i18 == (-950009856));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(2138772876, (-1384365563));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(92618432, (-1220732288));
        int i21 = multiplyService0.multiply((-953556088), (-1629479311));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply(236990600, 51449979);
        int i21 = multiplyService0.multiply(1080336032, (-681746432));
        int i24 = multiplyService0.multiply((-1330523392), (-778557619));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == (-1652043432));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(92618432, (-1220732288));
        int i21 = multiplyService0.multiply((-7304), 778560828);
        int i24 = multiplyService0.multiply(867985636, 1588940836);
        int i27 = multiplyService0.multiply((-308404334), (int) (short) 1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-71587808));
        org.junit.Assert.assertTrue(i24 == 142213136);
        org.junit.Assert.assertTrue(i27 == (-308404334));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(3201, 774557175);
        int i18 = multiplyService0.multiply((-2388479), 0);
        int i21 = multiplyService0.multiply((int) (short) -1, (-13147));
        int i24 = multiplyService0.multiply((-1827510048), 1164984832);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1161387383);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 17416192);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(1758382896, (-482980236));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(377139325, 11200);
        int i21 = sumService0.add(1328957751, (-72237792));
        int i24 = sumService0.add(101, 1829254332);
        int i27 = sumService0.add((-1420919549), (-912599118));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 377150525);
        org.junit.Assert.assertTrue(i21 == 1256719959);
        org.junit.Assert.assertTrue(i24 == 1829254433);
        org.junit.Assert.assertTrue(i27 == 1961448629);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(0, 3201);
        int i21 = sumService0.add(194, 236990600);
        int i24 = sumService0.add(193, 154047106);
        int i27 = sumService0.add((-1294215043), 292600);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 3201);
        org.junit.Assert.assertTrue(i21 == 236990794);
        org.junit.Assert.assertTrue(i24 == 154047299);
        org.junit.Assert.assertTrue(i27 == (-1293922443));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply(42, 377156815);
        int i12 = multiplyService0.multiply(519666606, (-2144686191));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1339282954));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 914894112);
        int i15 = sumService0.add(1292047473, 377150525);
        int i18 = sumService0.add(756005296, (-1296581284));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 914894245);
        org.junit.Assert.assertTrue(i15 == 1669197998);
        org.junit.Assert.assertTrue(i18 == (-540575988));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply(420000, 5660160);
        int i15 = multiplyService0.multiply(1300656750, 698737024);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == (-2144681984));
        org.junit.Assert.assertTrue(i15 == 1286726912);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add((-1537200), 0);
        int i24 = sumService0.add(17724, 51450011);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == (-1537200));
        org.junit.Assert.assertTrue(i24 == 51467735);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add((-953556088), (-650642891));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == (-1604198979));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(1, (-32));
        int i9 = sumService0.add(160579584, (-4392));
        int i12 = sumService0.add(31, 100);
        int i15 = sumService0.add(51471642, (-1077467365));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-31));
        org.junit.Assert.assertTrue(i9 == 160575192);
        org.junit.Assert.assertTrue(i12 == 131);
        org.junit.Assert.assertTrue(i15 == (-1025995723));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply((-32), 416);
        int i24 = multiplyService0.multiply(2369874, (-1469120488));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(3200, 9);
        int i15 = sumService0.add(1797416241, (-318));
        int i18 = sumService0.add((int) (short) 0, 3201);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 1797415923);
        org.junit.Assert.assertTrue(i18 == 3201);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply(1319705344, 1829254433);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-27034880));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(915475213, (-1077463158));
        int i21 = sumService0.add(377139325, 1372804491);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == (-161987945));
        org.junit.Assert.assertTrue(i21 == 1749943816);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add((-1499487488), 472092032);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == (-1027395456));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add((-4391), 1335631400);
        int i12 = sumService0.add(51450461, 1669197998);
        int i15 = sumService0.add(1256719959, 72908080);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 1335627009);
        org.junit.Assert.assertTrue(i12 == 1720648459);
        org.junit.Assert.assertTrue(i15 == 1329628039);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply(236990600, 51449979);
        int i21 = multiplyService0.multiply(1080336032, (-681746432));
        int i24 = multiplyService0.multiply(893576728, (-626325562));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == (-1652043432));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(350, 42);
        int i12 = multiplyService0.multiply(642401459, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 14700);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) 'a', 1382089355);
        int i12 = multiplyService0.multiply(0, 1923399140);
        int i15 = multiplyService0.multiply(1382088704, 872698769);
        int i18 = multiplyService0.multiply(18576, (-258687196));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 918681259);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 468779008);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add((-4390), 818775962);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 818771572);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(647286792, (-1164400768));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == (-517113976));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add(132, (-1537067));
        int i18 = sumService0.add((-318), 53);
        int i21 = sumService0.add(334946989, 1334161400);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == (-1536935));
        org.junit.Assert.assertTrue(i18 == (-265));
        org.junit.Assert.assertTrue(i21 == 1669108389);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add((-32), 42);
        int i21 = sumService0.add((-1077445373), (-1536935));
        int i24 = sumService0.add(756005296, 4200);
        int i27 = sumService0.add((-1620827082), 1086);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertTrue(i21 == (-1078982308));
        org.junit.Assert.assertTrue(i24 == 756009496);
        org.junit.Assert.assertTrue(i27 == (-1620825996));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add((int) (byte) 10, 266);
        int i15 = sumService0.add((int) (short) 1, 3200);
        int i18 = sumService0.add(1839811939, 160594284);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 276);
        org.junit.Assert.assertTrue(i15 == 3201);
        org.junit.Assert.assertTrue(i18 == 2000406223);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, 818776312);
        int i15 = multiplyService0.multiply(377150557, 214584351);
        int i18 = multiplyService0.multiply((-726304512), (-390266160));
        int i21 = multiplyService0.multiply(0, 1335627009);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1873693507);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(0, (-1607189544));
        int i15 = sumService0.add((int) (short) 1, (-223088464));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == (-1607189544));
        org.junit.Assert.assertTrue(i15 == (-223088463));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (byte) -1, 0);
        int i15 = multiplyService0.multiply((-778560828), 1489053800);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2008907680);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(2369842, (-319));
        int i21 = multiplyService0.multiply((-4361), (-787016052));
        int i24 = multiplyService0.multiply(1500649660, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(416, 1382088705);
        int i18 = sumService0.add(377138528, (int) (short) -1);
        int i21 = sumService0.add((-1652043432), (-236821640));
        int i24 = sumService0.add((-1076953436), (-1629091072));
        int i27 = sumService0.add((-1635471702), 1309517028);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 1382089121);
        org.junit.Assert.assertTrue(i18 == 377138527);
        org.junit.Assert.assertTrue(i21 == (-1888865072));
        org.junit.Assert.assertTrue(i24 == 1588922788);
        org.junit.Assert.assertTrue(i27 == (-325954674));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add(1125541544, (-2145414680));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == (-1019873136));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(377139325, 11200);
        int i21 = sumService0.add(1328957751, (-72237792));
        int i24 = sumService0.add(101, 1829254332);
        int i27 = sumService0.add(0, 396322690);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 377150525);
        org.junit.Assert.assertTrue(i21 == 1256719959);
        org.junit.Assert.assertTrue(i24 == 1829254433);
        org.junit.Assert.assertTrue(i27 == 396322690);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(559154858, 320);
        int i21 = multiplyService0.multiply(917432606, 1348049301);
        int i24 = multiplyService0.multiply((-1969079032), (-104030208));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1459071872));
        org.junit.Assert.assertTrue(i21 == (-930177930));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(42, 76440001);
        int i21 = multiplyService0.multiply(51454210, 918681259);
        int i24 = multiplyService0.multiply(1334161497, 1128);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1084487254));
        org.junit.Assert.assertTrue(i21 == (-794101674));
        org.junit.Assert.assertTrue(i24 == 1695615016);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(3200, 9);
        int i15 = sumService0.add((-32), 2369874);
        int i18 = sumService0.add((-733692672), 386);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 2369842);
        org.junit.Assert.assertTrue(i18 == (-733692286));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add(377138528, 97);
        int i15 = sumService0.add(0, 0);
        int i18 = sumService0.add(18048, 519666606);
        int i21 = sumService0.add((-733692672), 1296581294);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 377138625);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 519684654);
        org.junit.Assert.assertTrue(i21 == 562888622);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 10, 0);
        int i15 = multiplyService0.multiply((-6774564), 31);
        int i18 = multiplyService0.multiply(778560828, 386);
        int i21 = multiplyService0.multiply(14710, 130219616);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-210011484));
        org.junit.Assert.assertTrue(i18 == (-123231112));
        org.junit.Assert.assertTrue(i21 == (-24862656));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-1), (-4392));
        int i12 = multiplyService0.multiply((-493126080), (-318));
        int i15 = multiplyService0.multiply(967253556, 76440001);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1514633524);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(0, 3201);
        int i21 = sumService0.add(194, 236990600);
        int i24 = sumService0.add(1, 320);
        int i27 = sumService0.add((-762612983), 1470000);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 3201);
        org.junit.Assert.assertTrue(i21 == 236990794);
        org.junit.Assert.assertTrue(i24 == 321);
        org.junit.Assert.assertTrue(i27 == (-761142983));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply(700, 915475213);
        int i15 = multiplyService0.multiply(2425500, (-6774564));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 882521996);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 701);
        int i15 = multiplyService0.multiply(818776312, 51450997);
        int i18 = multiplyService0.multiply(562888622, 51450010);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1562048856);
        org.junit.Assert.assertTrue(i18 == 56274604);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4339), 132);
        int i24 = sumService0.add(17730, 1);
        int i27 = sumService0.add(0, 1002060536);
        int i30 = sumService0.add(142213136, 472092032);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-4207));
        org.junit.Assert.assertTrue(i24 == 17731);
        org.junit.Assert.assertTrue(i27 == 1002060536);
        org.junit.Assert.assertTrue(i30 == 614305168);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(4200, (int) (byte) 100);
        int i15 = multiplyService0.multiply((-1459071872), 1869567104);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 420000);
        org.junit.Assert.assertTrue(i15 == 1667514368);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(14700, (int) (short) 10);
        int i9 = sumService0.add(14701, 0);
        int i12 = sumService0.add((-4207), (-1077463158));
        int i15 = sumService0.add((-2144681984), (-4207));
        int i18 = sumService0.add((-1649673622), 1885806912);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 14710);
        org.junit.Assert.assertTrue(i9 == 14701);
        org.junit.Assert.assertTrue(i12 == (-1077467365));
        org.junit.Assert.assertTrue(i15 == (-2144686191));
        org.junit.Assert.assertTrue(i18 == 236133290);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(2370192, 386);
        int i24 = multiplyService0.multiply(1292047509, 377138528);
        int i27 = multiplyService0.multiply(2000406223, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == (-1827510048));
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply(1352000, (-4084));
        int i24 = multiplyService0.multiply(377138527, 67247920);
        int i27 = multiplyService0.multiply((-1965151091), (-1757766714));
        int i30 = multiplyService0.multiply((-810310954), 36);
        int i33 = multiplyService0.multiply(1700877488, 874002638);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == (-390266160));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 893576728);
        org.junit.Assert.assertTrue(i33 == (-1890015840));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(133, (-1537200));
        int i15 = sumService0.add(1474200, (-318));
        int i18 = sumService0.add(1335631400, 1620577792);
        int i21 = sumService0.add((-2130442612), (-1008953315));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == (-1537067));
        org.junit.Assert.assertTrue(i15 == 1473882);
        org.junit.Assert.assertTrue(i18 == (-1338758104));
        org.junit.Assert.assertTrue(i21 == 1155571369);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply(320, 1256700751);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == (-1582685504));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((-319), 14560000);
        int i15 = multiplyService0.multiply((-1381463152), (-4339));
        int i18 = multiplyService0.multiply(749034, (-2021475992));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == (-349672704));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((-1292427488), 4200);
        int i12 = multiplyService0.multiply(0, 131);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == 643212544);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply(3200, 0);
        int i21 = multiplyService0.multiply(296570614, 700);
        int i24 = multiplyService0.multiply(1250199350, (-861118659));
        int i27 = multiplyService0.multiply(18048, (-788441514));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1440999592);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-1381463152), 1309520648);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 1026165888);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add(1514633524, 10);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == 1514633534);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(377157165, 1382088704);
        int i27 = sumService0.add((-912620104), 20986);
        int i30 = sumService0.add(3755, 377150525);
        int i33 = sumService0.add(1796379824, (-95502336));
        int i36 = sumService0.add((-1220810752), (-1076953436));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == (-912599118));
        org.junit.Assert.assertTrue(i30 == 377154280);
        org.junit.Assert.assertTrue(i33 == 1700877488);
        org.junit.Assert.assertTrue(i36 == 1997203108);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply((int) (byte) 0, 1474200);
        int i21 = multiplyService0.multiply(9, (-13281));
        int i24 = multiplyService0.multiply(0, 47277568);
        int i27 = multiplyService0.multiply((-7304), (-1314387328));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-13312), 31);
        int i24 = sumService0.add((-1095912125), (-726304512));
        int i27 = sumService0.add((-6778883), 1164984832);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-13281));
        org.junit.Assert.assertTrue(i24 == (-1822216637));
        org.junit.Assert.assertTrue(i27 == 1158205949);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(749034, 559172619);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-1612238578));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add(377138528, 97);
        int i15 = sumService0.add(0, 0);
        int i18 = sumService0.add(18048, 519666606);
        int i21 = sumService0.add(51450000, (-787016052));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 377138625);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 519684654);
        org.junit.Assert.assertTrue(i21 == (-735566052));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply(420000, 5660160);
        int i15 = multiplyService0.multiply((-210011484), 7388160);
        int i18 = multiplyService0.multiply(47277568, 14560032);
        int i21 = multiplyService0.multiply((-2144681984), 9);
        int i24 = multiplyService0.multiply(386, (-827083360));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == (-2144681984));
        org.junit.Assert.assertTrue(i15 == 1439723520);
        org.junit.Assert.assertTrue(i18 == (-95502336));
        org.junit.Assert.assertTrue(i21 == (-2122268672));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(92618432, (-1220732288));
        int i21 = multiplyService0.multiply((-7304), 778560828);
        int i24 = multiplyService0.multiply(867985636, 1588940836);
        int i27 = multiplyService0.multiply((-1620825996), 318);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-71587808));
        org.junit.Assert.assertTrue(i24 == 142213136);
        org.junit.Assert.assertTrue(i27 == (-26591208));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(897633037, 377157165);
        int i15 = multiplyService0.multiply((-737134487), (-13070257));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 217329481);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(920032939, 11904);
        int i18 = multiplyService0.multiply(818776312, 1894292752);
        int i21 = multiplyService0.multiply(1309520648, 1961448629);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-94498944));
        org.junit.Assert.assertTrue(i18 == (-1164400768));
        org.junit.Assert.assertTrue(i21 == 1085682856);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 1, 236990600);
        int i15 = multiplyService0.multiply(0, (-47391645));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply((-32), (-13147));
        int i18 = multiplyService0.multiply(1695615016, 20986);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 372678416);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply(647268744, 874007030);
        int i24 = multiplyService0.multiply(132, (int) 'a');
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == (-223088464));
        org.junit.Assert.assertTrue(i24 == 12804);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(0, 1352000);
        int i21 = multiplyService0.multiply((-4390), 1382088705);
        int i24 = multiplyService0.multiply((-1249303706), 1474200);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1419374298);
        org.junit.Assert.assertTrue(i24 == 1402812560);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply(42, 100);
        int i27 = multiplyService0.multiply((-19208), 559172619);
        int i30 = multiplyService0.multiply(559154858, (-517113976));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 4200);
        org.junit.Assert.assertTrue(i27 == 1125541544);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply(350, 147000);
        int i6 = multiplyService0.multiply(559150467, 14546853);
        int i9 = multiplyService0.multiply(1667514368, 1839793749);
        org.junit.Assert.assertTrue(i3 == 51450000);
        org.junit.Assert.assertTrue(i6 == 1863688815);
        org.junit.Assert.assertTrue(i9 == (-1714864128));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add((int) (byte) 10, 266);
        int i15 = sumService0.add((int) (short) 1, 3200);
        int i18 = sumService0.add((-1541019), 17724);
        int i21 = sumService0.add((-4084), (-4390));
        int i24 = sumService0.add(11200, 874007030);
        int i27 = sumService0.add(14560000, (-390266160));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 276);
        org.junit.Assert.assertTrue(i15 == 3201);
        org.junit.Assert.assertTrue(i18 == (-1523295));
        org.junit.Assert.assertTrue(i21 == (-8474));
        org.junit.Assert.assertTrue(i24 == 874018230);
        org.junit.Assert.assertTrue(i27 == (-375706160));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4392), 350);
        int i24 = sumService0.add(1351680, 918681259);
        int i27 = sumService0.add(133, (-912599118));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-4042));
        org.junit.Assert.assertTrue(i24 == 920032939);
        org.junit.Assert.assertTrue(i27 == (-912598985));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply((-32), 416);
        int i24 = multiplyService0.multiply(276, 296570614);
        int i27 = multiplyService0.multiply(3209, (-1890015840));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 249110840);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add((-1275653288), (-462895099));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == (-1738548387));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply((int) (byte) -1, 379527007);
        int i24 = multiplyService0.multiply((-840472364), 346332000);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == (-379527007));
        org.junit.Assert.assertTrue(i24 == 185576320);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(67247920, 5660160);
        int i18 = sumService0.add(1474200, (int) '#');
        int i21 = sumService0.add(217329675, (int) (short) -1);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == 72908080);
        org.junit.Assert.assertTrue(i18 == 1474235);
        org.junit.Assert.assertTrue(i21 == 217329674);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((-42210176), 145600);
        int i15 = multiplyService0.multiply((-1874401953), (-950009856));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 296574976);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(1, (-32));
        int i9 = sumService0.add(134, 610625987);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-31));
        org.junit.Assert.assertTrue(i9 == 610626121);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply((int) (byte) -1, 379527007);
        int i24 = multiplyService0.multiply(1759245869, 2049805233);
        int i27 = multiplyService0.multiply(516, (-1));
        int i30 = multiplyService0.multiply(154047106, 1500645299);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == (-379527007));
        org.junit.Assert.assertTrue(i24 == (-1498897379));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 561381094);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(379527007, (-13312));
        int i21 = multiplyService0.multiply(1089162661, 1772188476);
        int i24 = multiplyService0.multiply(377150525, 872698769);
        int i27 = multiplyService0.multiply(10, 468779008);
        int i30 = multiplyService0.multiply((-1731821184), 76440001);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1825329580);
        org.junit.Assert.assertTrue(i24 == 1710392717);
        org.junit.Assert.assertTrue(i27 == 392822784);
        org.junit.Assert.assertTrue(i30 == 968434048);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply(4256, 11937480);
        int i18 = multiplyService0.multiply(2443188, (-1011378815));
        int i21 = multiplyService0.multiply(160594284, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == (-733692672));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(67247920, 5660160);
        int i18 = sumService0.add((-1629091072), 818780118);
        int i21 = sumService0.add((-762192983), 53);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == 72908080);
        org.junit.Assert.assertTrue(i18 == (-810310954));
        org.junit.Assert.assertTrue(i21 == (-762192930));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(51450000, (int) (byte) 10);
        int i15 = sumService0.add(1797416241, 1669197998);
        int i18 = sumService0.add((-1835290376), 296570614);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 51450010);
        org.junit.Assert.assertTrue(i15 == (-828353057));
        org.junit.Assert.assertTrue(i18 == (-1538719762));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add(377150525, (-861118824));
        int i21 = sumService0.add((int) ' ', (-828624379));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == (-483968299));
        org.junit.Assert.assertTrue(i21 == (-828624347));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(0, 3201);
        int i21 = sumService0.add(194, 236990600);
        int i24 = sumService0.add(193, 154047106);
        int i27 = sumService0.add(2096518976, (-1076953436));
        int i30 = sumService0.add((-1776064471), 236995050);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 3201);
        org.junit.Assert.assertTrue(i21 == 236990794);
        org.junit.Assert.assertTrue(i24 == 154047299);
        org.junit.Assert.assertTrue(i27 == 1019565540);
        org.junit.Assert.assertTrue(i30 == (-1539069421));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add(377138528, 97);
        int i15 = sumService0.add(0, 0);
        int i18 = sumService0.add((-4390), 1700492387);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 377138625);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1700487997);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(2370192, 386);
        int i24 = multiplyService0.multiply(1292047509, 377138528);
        int i27 = multiplyService0.multiply(1700487997, 154047299);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == (-1827510048));
        org.junit.Assert.assertTrue(i27 == (-86179849));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(266, 17785);
        int i18 = multiplyService0.multiply(700, 3720);
        int i21 = multiplyService0.multiply((-1615688488), (-478267292));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 4730810);
        org.junit.Assert.assertTrue(i18 == 2604000);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 914894112);
        int i15 = sumService0.add(1292047473, 377150525);
        int i18 = sumService0.add(154047106, 0);
        int i21 = sumService0.add(874007062, 194);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 914894245);
        org.junit.Assert.assertTrue(i15 == 1669197998);
        org.junit.Assert.assertTrue(i18 == 154047106);
        org.junit.Assert.assertTrue(i21 == 874007256);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add(17785, 914894621);
        int i21 = sumService0.add((-777639176), 377157165);
        int i24 = sumService0.add((-778570983), (-861118824));
        int i27 = sumService0.add(1080336032, (-368954624));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == 914912406);
        org.junit.Assert.assertTrue(i21 == (-400482011));
        org.junit.Assert.assertTrue(i24 == (-1639689807));
        org.junit.Assert.assertTrue(i27 == 711381408);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-13312), 31);
        int i24 = sumService0.add(548, 914894621);
        int i27 = sumService0.add((-713157760), 4321341);
        int i30 = sumService0.add(17760, 914895373);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-13281));
        org.junit.Assert.assertTrue(i24 == 914895169);
        org.junit.Assert.assertTrue(i27 == (-708836419));
        org.junit.Assert.assertTrue(i30 == 914913133);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add((-1077467365), 2366108);
        int i15 = sumService0.add(1155571369, (-1814799890));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == (-1075101257));
        org.junit.Assert.assertTrue(i15 == (-659228521));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply(0, 264818450);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (-1199150660));
        int i12 = sumService0.add(1942661936, (-1984806892));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == (-1199150659));
        org.junit.Assert.assertTrue(i12 == (-42144956));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply(4256, 11937480);
        int i18 = multiplyService0.multiply(698737024, 12998);
        int i21 = multiplyService0.multiply((-1019873136), (-204783124));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == (-733692672));
        org.junit.Assert.assertTrue(i18 == (-1671993088));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply((-32), (-13147));
        int i18 = multiplyService0.multiply(296574976, (-1335626144));
        int i21 = multiplyService0.multiply((-659228521), 1921403707);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1402177485);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(897633037, 17842176);
        int i15 = sumService0.add((-1827514450), 914894345);
        int i18 = sumService0.add(0, 0);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 915475213);
        org.junit.Assert.assertTrue(i15 == (-912620105));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply((-1346170880), (-953541068));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(1829254433, (-579055083));
        int i15 = sumService0.add(920032939, (-1871938824));
        int i18 = sumService0.add(1305542656, 1599313341);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 1250199350);
        org.junit.Assert.assertTrue(i15 == (-951905885));
        org.junit.Assert.assertTrue(i18 == (-1390111299));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add((int) (byte) 10, 266);
        int i15 = sumService0.add((int) (short) 1, 3200);
        int i18 = sumService0.add((-1731821184), 774557175);
        int i21 = sumService0.add(1154199698, 1286726912);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 276);
        org.junit.Assert.assertTrue(i15 == 3201);
        org.junit.Assert.assertTrue(i18 == (-957264009));
        org.junit.Assert.assertTrue(i21 == (-1854040686));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(14701, (-4392));
        int i21 = multiplyService0.multiply(21632, 1759263629);
        int i24 = multiplyService0.multiply(1353836913, 1128);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1314387328));
        org.junit.Assert.assertTrue(i24 == (-1880319512));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(319, 97);
        int i18 = sumService0.add(377156815, 2370192);
        int i21 = sumService0.add((-1652043432), 914908945);
        int i24 = sumService0.add(712023936, 0);
        int i27 = sumService0.add(51468007, 1296581294);
        int i30 = sumService0.add(1660944384, 1309520648);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 416);
        org.junit.Assert.assertTrue(i18 == 379527007);
        org.junit.Assert.assertTrue(i21 == (-737134487));
        org.junit.Assert.assertTrue(i24 == 712023936);
        org.junit.Assert.assertTrue(i27 == 1348049301);
        org.junit.Assert.assertTrue(i30 == (-1324502264));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(3200, 9);
        int i15 = sumService0.add((-32), 2369874);
        int i18 = sumService0.add(1296581284, 0);
        int i21 = sumService0.add((-778557619), (-13364));
        int i24 = sumService0.add((-1523295), 1164984832);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 2369842);
        org.junit.Assert.assertTrue(i18 == 1296581284);
        org.junit.Assert.assertTrue(i21 == (-778570983));
        org.junit.Assert.assertTrue(i24 == 1163461537);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add((-4392), (int) (byte) 1);
        int i12 = sumService0.add(818775862, 4256);
        int i15 = sumService0.add((-2122268672), 154047106);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == (-4391));
        org.junit.Assert.assertTrue(i12 == 818780118);
        org.junit.Assert.assertTrue(i15 == (-1968221566));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(1873693507, 1259679106);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == (-1161594683));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply(712023936, 377139325);
        int i24 = multiplyService0.multiply(376390144, 137053098);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == 698737024);
        org.junit.Assert.assertTrue(i24 == 438817792);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add((-32), 42);
        int i21 = sumService0.add(236995050, 2443188);
        int i24 = sumService0.add(712613553, (-2130442612));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertTrue(i21 == 239438238);
        org.junit.Assert.assertTrue(i24 == (-1417829059));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(559154828, 653328384);
        int i15 = sumService0.add((-42210176), 377157165);
        int i18 = sumService0.add(2425634, (-1127180196));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 1212483212);
        org.junit.Assert.assertTrue(i15 == 334946989);
        org.junit.Assert.assertTrue(i18 == (-1124754562));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(416, 1382088705);
        int i18 = sumService0.add(377138528, (int) (short) -1);
        int i21 = sumService0.add((-1652043432), (-236821640));
        int i24 = sumService0.add((-1076953436), (-1629091072));
        int i27 = sumService0.add((-1871938824), 1955233);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 1382089121);
        org.junit.Assert.assertTrue(i18 == 377138527);
        org.junit.Assert.assertTrue(i21 == (-1888865072));
        org.junit.Assert.assertTrue(i24 == 1588922788);
        org.junit.Assert.assertTrue(i27 == (-1869983591));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply(749371392, (-1330523392));
        int i30 = multiplyService0.multiply(559172619, 647268744);
        int i33 = multiplyService0.multiply(1796379824, 1588922788);
        int i36 = multiplyService0.multiply((-1871938824), 160575202);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 1775651032);
        org.junit.Assert.assertTrue(i33 == (-7245632));
        org.junit.Assert.assertTrue(i36 == (-682811664));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(350, 42);
        int i12 = multiplyService0.multiply(0, (-4073));
        int i15 = multiplyService0.multiply((-1398925746), (-1296578083));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 14700);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(1351680, 1296581294);
        int i21 = multiplyService0.multiply(394431477, 1916619352);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1598341120);
        org.junit.Assert.assertTrue(i21 == 1152773688);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(3201, 774557175);
        int i18 = multiplyService0.multiply((-2388479), 0);
        int i21 = multiplyService0.multiply((int) (short) -1, (-13147));
        int i24 = multiplyService0.multiply((-32), 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1161387383);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 4200);
        int i15 = multiplyService0.multiply((-1), (-31));
        int i18 = multiplyService0.multiply(51450297, (int) (byte) 1);
        int i21 = multiplyService0.multiply(1440999592, 11904);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 51450297);
        org.junit.Assert.assertTrue(i21 == (-440237056));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add((-4391), (int) (short) 0);
        int i15 = sumService0.add((-4339), 10);
        int i18 = sumService0.add((-2081677312), (-1339282954));
        int i21 = sumService0.add((-1011378815), 882521996);
        int i24 = sumService0.add(0, 1797416241);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == (-4391));
        org.junit.Assert.assertTrue(i15 == (-4329));
        org.junit.Assert.assertTrue(i18 == 874007030);
        org.junit.Assert.assertTrue(i21 == (-128856819));
        org.junit.Assert.assertTrue(i24 == 1797416241);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((int) ' ', 14560000);
        int i18 = sumService0.add(372, (int) (short) 1);
        int i21 = sumService0.add(386, 774556789);
        int i24 = sumService0.add(2366108, (-1296581151));
        int i27 = sumService0.add(326142208, (-810310954));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 14560032);
        org.junit.Assert.assertTrue(i18 == 373);
        org.junit.Assert.assertTrue(i21 == 774557175);
        org.junit.Assert.assertTrue(i24 == (-1294215043));
        org.junit.Assert.assertTrue(i27 == (-484168746));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply(420000, 5660160);
        int i15 = multiplyService0.multiply(14560183, 1382089355);
        int i18 = multiplyService0.multiply(266, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == (-2144681984));
        org.junit.Assert.assertTrue(i15 == 1666198109);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-13312), 31);
        int i24 = sumService0.add(214584351, 1309517028);
        int i27 = sumService0.add(0, 18190);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-13281));
        org.junit.Assert.assertTrue(i24 == 1524101379);
        org.junit.Assert.assertTrue(i27 == 18190);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(51450000, 20064);
        int i21 = multiplyService0.multiply(882521996, 559154858);
        int i24 = multiplyService0.multiply(1309520648, 1759245869);
        int i27 = multiplyService0.multiply(698737024, 2049805233);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1500648960);
        org.junit.Assert.assertTrue(i21 == (-777639176));
        org.junit.Assert.assertTrue(i24 == 1246373992);
        org.junit.Assert.assertTrue(i27 == (-2136905344));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add(11937480, 249110840);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == 261048320);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((-349672704), (-661706111));
        int i18 = sumService0.add((-1898952389), (-586291745));
        int i21 = sumService0.add(755727000, 1292047473);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == (-1011378815));
        org.junit.Assert.assertTrue(i18 == 1809723162);
        org.junit.Assert.assertTrue(i21 == 2047774473);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 100, 914908945);
        int i15 = multiplyService0.multiply(101, (-1652043432));
        int i18 = multiplyService0.multiply(0, (int) (short) -1);
        int i21 = multiplyService0.multiply(31, 97);
        int i24 = multiplyService0.multiply(749034, 217329674);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 3007);
        org.junit.Assert.assertTrue(i24 == (-535418076));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add((-4391), (int) (short) 0);
        int i15 = sumService0.add((-4339), 10);
        int i18 = sumService0.add((-2081677312), (int) (byte) 1);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == (-4391));
        org.junit.Assert.assertTrue(i15 == (-4329));
        org.junit.Assert.assertTrue(i18 == (-2081677311));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add(377138528, 97);
        int i15 = sumService0.add((-1296570913), (-1731821184));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 377138625);
        org.junit.Assert.assertTrue(i15 == 1266575199);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply(559141712, (-1124754562));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(14701, (-4392));
        int i21 = multiplyService0.multiply(21632, 1759263629);
        int i24 = multiplyService0.multiply((-2021475992), 1309520648);
        int i27 = multiplyService0.multiply(502029409, (-1649673622));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1314387328));
        org.junit.Assert.assertTrue(i24 == (-1107197120));
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(14700, (int) (short) 10);
        int i9 = sumService0.add(14701, 0);
        int i12 = sumService0.add((-4207), (-1077463158));
        int i15 = sumService0.add((-4362), 296574976);
        int i18 = sumService0.add((-1975096195), 346332000);
        int i21 = sumService0.add(320, 51450297);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 14710);
        org.junit.Assert.assertTrue(i9 == 14701);
        org.junit.Assert.assertTrue(i12 == (-1077467365));
        org.junit.Assert.assertTrue(i15 == 296570614);
        org.junit.Assert.assertTrue(i18 == (-1628764195));
        org.junit.Assert.assertTrue(i21 == 51450617);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(3209, (int) (byte) 1);
        int i15 = multiplyService0.multiply(897632954, (-953556088));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply((-32), 416);
        int i24 = multiplyService0.multiply(276, 296570614);
        int i27 = multiplyService0.multiply(386, 559141712);
        int i30 = multiplyService0.multiply(0, 1614205120);
        int i33 = multiplyService0.multiply((-1716797440), (-1469120488));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 249110840);
        org.junit.Assert.assertTrue(i27 == 1080336032);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply((int) ' ', (-4084));
        int i15 = multiplyService0.multiply((-4339), (-737134487));
        int i18 = multiplyService0.multiply(617272736, (-926097396));
        int i21 = multiplyService0.multiply(101, 1439723520);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-616812544));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 516);
        int i15 = sumService0.add(1, 76440000);
        int i18 = sumService0.add(1086, 42);
        int i21 = sumService0.add(559175844, (-318));
        int i24 = sumService0.add((-1710872314), 1869567104);
        int i27 = sumService0.add((-349672704), (-4073));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 548);
        org.junit.Assert.assertTrue(i15 == 76440001);
        org.junit.Assert.assertTrue(i18 == 1128);
        org.junit.Assert.assertTrue(i21 == 559175526);
        org.junit.Assert.assertTrue(i24 == 158694790);
        org.junit.Assert.assertTrue(i27 == (-349676777));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(2370192, 386);
        int i24 = multiplyService0.multiply((-1), 1296581284);
        int i27 = multiplyService0.multiply(145600, (int) (byte) 100);
        int i30 = multiplyService0.multiply(1296581294, (-318));
        int i33 = multiplyService0.multiply((-318), 1352000);
        int i36 = multiplyService0.multiply(1382089121, 755727000);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == (-1296581284));
        org.junit.Assert.assertTrue(i27 == 14560000);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == (-429936000));
        org.junit.Assert.assertTrue(i36 == (-2092256872));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(2370192, 386);
        int i24 = multiplyService0.multiply((-1), 1296581284);
        int i27 = multiplyService0.multiply(145600, (int) (byte) 100);
        int i30 = multiplyService0.multiply((-1537200), (int) (byte) 0);
        int i33 = multiplyService0.multiply((-1127180196), 180879360);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == (-1296581284));
        org.junit.Assert.assertTrue(i27 == 14560000);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == (-1612709888));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add(132, (-1537067));
        int i18 = sumService0.add((-1296581151), (-1296585613));
        int i21 = sumService0.add(51450997, 0);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == (-1536935));
        org.junit.Assert.assertTrue(i18 == 1701800532);
        org.junit.Assert.assertTrue(i21 == 51450997);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply(749371392, (-1330523392));
        int i30 = multiplyService0.multiply(559172619, 647268744);
        int i33 = multiplyService0.multiply(1796379824, 1588922788);
        int i36 = multiplyService0.multiply(914895373, 1588940836);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 1775651032);
        org.junit.Assert.assertTrue(i33 == (-7245632));
        org.junit.Assert.assertTrue(i36 == 1677466068);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add((-71587808), (-579055083));
        int i21 = sumService0.add((-97056977), (-1384365563));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == (-650642891));
        org.junit.Assert.assertTrue(i21 == (-1481422540));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(1171050618, (-24862656));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1146187962);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(0, 3201);
        int i21 = sumService0.add(194, 236990600);
        int i24 = sumService0.add(1, 320);
        int i27 = sumService0.add(14710, 1701800532);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 3201);
        org.junit.Assert.assertTrue(i21 == 236990794);
        org.junit.Assert.assertTrue(i24 == 321);
        org.junit.Assert.assertTrue(i27 == 1701815242);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(101, (-4207));
        int i12 = multiplyService0.multiply(893767818, 897633037);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-404159230));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(51450461, 756005296);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-562768656));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply((-32), 416);
        int i24 = multiplyService0.multiply(276, 296570614);
        int i27 = multiplyService0.multiply(386, 559141712);
        int i30 = multiplyService0.multiply(0, 1614205120);
        int i33 = multiplyService0.multiply(1759245869, 818775962);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 249110840);
        org.junit.Assert.assertTrue(i27 == 1080336032);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == (-1523789294));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply((-32), 416);
        int i24 = multiplyService0.multiply((-40840), (-319));
        int i27 = multiplyService0.multiply((-462895099), 1382089121);
        int i30 = multiplyService0.multiply(2604000, 133);
        int i33 = multiplyService0.multiply(0, (-1019873136));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 1922224165);
        org.junit.Assert.assertTrue(i30 == 346332000);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(320, 17688);
        int i18 = multiplyService0.multiply(465322240, (-1314386780));
        int i21 = multiplyService0.multiply(350, 874018230);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 5660160);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 963702484);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add(319, 51450000);
        int i21 = sumService0.add((-1533480), (-1533678451));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51450319);
        org.junit.Assert.assertTrue(i21 == (-1535211931));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply(1296581284, (int) (short) 1);
        int i15 = multiplyService0.multiply(1290506454, 1193568256);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 1794043904);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((-349672704), (-661706111));
        int i18 = sumService0.add((int) '#', 47277568);
        int i21 = sumService0.add(158694790, (-1532688908));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == (-1011378815));
        org.junit.Assert.assertTrue(i18 == 47277603);
        org.junit.Assert.assertTrue(i21 == (-1373994118));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (short) 1, 10);
        int i12 = multiplyService0.multiply(0, (-737134487));
        int i15 = multiplyService0.multiply((-1994915840), 264818450);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 196083712);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(377157165, 1382088704);
        int i27 = sumService0.add(14710, (-818780118));
        int i30 = sumService0.add(1562048856, (-455230776));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == (-818765408));
        org.junit.Assert.assertTrue(i30 == 1106818080);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1470000, 1334161400);
        int i15 = sumService0.add(376390144, (-1652043432));
        int i18 = sumService0.add((-308404334), (-1869983591));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1335631400);
        org.junit.Assert.assertTrue(i15 == (-1275653288));
        org.junit.Assert.assertTrue(i18 == 2116579371);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply(1470000, (int) '4');
        int i24 = multiplyService0.multiply(31, 236990600);
        int i27 = multiplyService0.multiply(874018230, 160575193);
        int i30 = multiplyService0.multiply(15947814, 0);
        int i33 = multiplyService0.multiply(314712735, (-1546294936));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 76440000);
        org.junit.Assert.assertTrue(i24 == (-1243225992));
        org.junit.Assert.assertTrue(i27 == 363756358);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(756005296, 1045170576);
        int i21 = multiplyService0.multiply((-1335626144), (-1523295));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == (-1499487488));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add((-1077463158), 236990794);
        int i15 = sumService0.add(559172619, 2369842);
        int i18 = sumService0.add(1348052926, (-1498897379));
        int i21 = sumService0.add(1906196480, 1759245869);
        int i24 = sumService0.add((-794101674), (-1617040168));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == (-840472364));
        org.junit.Assert.assertTrue(i15 == 561542461);
        org.junit.Assert.assertTrue(i18 == (-150844453));
        org.junit.Assert.assertTrue(i21 == (-629524947));
        org.junit.Assert.assertTrue(i24 == 1883825454);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((-4339), 4256);
        int i12 = sumService0.add((-462914307), (-678514911));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == (-83));
        org.junit.Assert.assertTrue(i12 == (-1141429218));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(18048, 1348052926);
        int i21 = multiplyService0.multiply(885292675, 51454210);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1330523392));
        org.junit.Assert.assertTrue(i21 == (-1383407610));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(3209, 319);
        int i9 = sumService0.add(1467056384, 915475213);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 3528);
        org.junit.Assert.assertTrue(i9 == (-1912435699));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((-42210176), 145600);
        int i15 = multiplyService0.multiply((-47391645), (-711513045));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 296574976);
        org.junit.Assert.assertTrue(i15 == 0);
    }
}

