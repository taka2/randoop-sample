import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add(51449979, 160575192);
        int i21 = sumService0.add(1419374298, 502029409);
        int i24 = sumService0.add(142, (-912598985));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == 212025171);
        org.junit.Assert.assertTrue(i21 == 1921403707);
        org.junit.Assert.assertTrue(i24 == (-912598843));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(3209, (int) (byte) 1);
        int i15 = multiplyService0.multiply(101, 236990600);
        int i18 = multiplyService0.multiply(874007030, (-951905885));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == (-1833753176));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply((-4084), 17688);
        int i18 = multiplyService0.multiply(164752000, (int) (byte) 100);
        int i21 = multiplyService0.multiply(516, 51450319);
        int i24 = multiplyService0.multiply((-1541019), (-1062015850));
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply(9, 17842176);
        int i15 = multiplyService0.multiply(559175844, 14700);
        int i18 = multiplyService0.multiply((-1759098716), 164752266);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 160579584);
        org.junit.Assert.assertTrue(i15 == (-682497744));
        org.junit.Assert.assertTrue(i18 == (-1321880472));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add(377150525, (-861118824));
        int i21 = sumService0.add(1942661936, (-236821640));
        int i24 = sumService0.add(469, (-1652866106));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == (-483968299));
        org.junit.Assert.assertTrue(i21 == 1705840296);
        org.junit.Assert.assertTrue(i24 == (-1652865637));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply((int) (byte) 0, 1474200);
        int i21 = multiplyService0.multiply((-4329), (-861118659));
        int i24 = multiplyService0.multiply(73055080, 416);
        int i27 = multiplyService0.multiply(0, 1457160878);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 326142208);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply(236990600, 51449979);
        int i21 = multiplyService0.multiply(914894112, (-1220810752));
        int i24 = multiplyService0.multiply((-828353057), (-258687196));
        int i27 = multiplyService0.multiply(3243, 774556789);
        int i30 = multiplyService0.multiply((-1871938824), 152);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == (-1652043432));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-668201433));
        org.junit.Assert.assertTrue(i30 == (-1066859712));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply(700, 915475213);
        int i15 = multiplyService0.multiply(2369810, (-1827510048));
        int i18 = multiplyService0.multiply((-1293922443), 1080336032);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 882521996);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-2031100128));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
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
        int i33 = multiplyService0.multiply(0, (-312607803));
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
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add(17760, 1759245869);
        int i21 = sumService0.add(712023936, 377138725);
        int i24 = sumService0.add(1266575199, (-4042));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == 1759263629);
        org.junit.Assert.assertTrue(i21 == 1089162661);
        org.junit.Assert.assertTrue(i24 == 1266571157);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(4200, (int) (byte) 0);
        int i18 = multiplyService0.multiply((-6778883), 236990600);
        int i21 = multiplyService0.multiply((-1335626144), (-349672704));
        int i24 = multiplyService0.multiply(17842176, 3209);
        int i27 = multiplyService0.multiply(910407877, 51468007);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 967569000);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 1420967936);
        org.junit.Assert.assertTrue(i27 == 1262675907);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply(1352000, (-4084));
        int i24 = multiplyService0.multiply((-1220810752), (-1));
        int i27 = multiplyService0.multiply(1114112000, (-1947786240));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(559154859, (-4392));
        int i12 = sumService0.add(18190, (-1968221566));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 559150467);
        org.junit.Assert.assertTrue(i12 == (-1968203376));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(100, 914894245);
        int i21 = sumService0.add((-17519), 392822784);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 914894345);
        org.junit.Assert.assertTrue(i21 == 392805265);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add((-2081677311), (-1537200));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == (-2083214511));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add(134, (int) (byte) 100);
        int i24 = sumService0.add(1352000, (-1679585984));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 234);
        org.junit.Assert.assertTrue(i24 == (-1678233984));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add((-1296578083), 0);
        int i21 = sumService0.add(502029631, 559172938);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == (-1296578083));
        org.junit.Assert.assertTrue(i21 == 1061202569);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-1546294936), (-827083360));
        int i15 = multiplyService0.multiply(4321341, 3007);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 109370499);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(559154859, (-4392));
        int i12 = sumService0.add((int) (byte) 10, 160575192);
        int i15 = sumService0.add(340896000, (-1652043432));
        int i18 = sumService0.add((-1814799890), (-290783232));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 559150467);
        org.junit.Assert.assertTrue(i12 == 160575202);
        org.junit.Assert.assertTrue(i15 == (-1311147432));
        org.junit.Assert.assertTrue(i18 == (-2105583122));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(3200, 9);
        int i15 = sumService0.add((-32), 2369874);
        int i18 = sumService0.add(1382088704, 920032939);
        int i21 = sumService0.add((-210011484), (-2122268672));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 2369842);
        org.junit.Assert.assertTrue(i18 == (-1992845653));
        org.junit.Assert.assertTrue(i21 == 1962687140);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply(236990600, 51449979);
        int i21 = multiplyService0.multiply(914894112, (-1220810752));
        int i24 = multiplyService0.multiply((-10908642), 1470000);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == (-1652043432));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 1704143264);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add((-467302544), 1772188476);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 1304885932);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4392), 319);
        int i12 = sumService0.add(247677076, (-912619971));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4073));
        org.junit.Assert.assertTrue(i12 == (-664942895));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(1, (-32));
        int i9 = sumService0.add(160579584, (-4392));
        int i12 = sumService0.add(914908945, (-42210176));
        int i15 = sumService0.add((-13312), 595110372);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-31));
        org.junit.Assert.assertTrue(i9 == 160575192);
        org.junit.Assert.assertTrue(i12 == 872698769);
        org.junit.Assert.assertTrue(i15 == 595097060);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-1339282954), (int) ' ');
        int i15 = multiplyService0.multiply((-444431728), 904202840);
        int i18 = multiplyService0.multiply(1467056384, 14560000);
        int i21 = multiplyService0.multiply(1334161497, 92618432);
        int i24 = multiplyService0.multiply(0, 468779008);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 92618432);
        org.junit.Assert.assertTrue(i15 == (-1731821184));
        org.junit.Assert.assertTrue(i18 == (-290783232));
        org.junit.Assert.assertTrue(i21 == 1614205120);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((-1292427488), 4200);
        int i12 = multiplyService0.multiply(51450997, 373);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == 643212544);
        org.junit.Assert.assertTrue(i12 == 2011352697);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(0, 3201);
        int i21 = sumService0.add(194, 236990600);
        int i24 = sumService0.add(1, 320);
        int i27 = sumService0.add((int) (byte) 10, 47277568);
        int i30 = sumService0.add(20064, 1863688815);
        int i33 = sumService0.add(1171050618, (-455230776));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 3201);
        org.junit.Assert.assertTrue(i21 == 236990794);
        org.junit.Assert.assertTrue(i24 == 321);
        org.junit.Assert.assertTrue(i27 == 47277578);
        org.junit.Assert.assertTrue(i30 == 1863708879);
        org.junit.Assert.assertTrue(i33 == 715819842);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) 'a', 1382089355);
        int i12 = multiplyService0.multiply((-787016052), (-13129));
        int i15 = multiplyService0.multiply(1708098459, (-308404334));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 918681259);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add((-32), 42);
        int i21 = sumService0.add(236995050, 2443188);
        int i24 = sumService0.add(203, 595110372);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertTrue(i21 == 239438238);
        org.junit.Assert.assertTrue(i24 == 595110575);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply((-95502336), (-787016052));
        int i21 = multiplyService0.multiply(51450000, (-1541019));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (-1199150660));
        int i12 = sumService0.add(521082377, (-1536935));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == (-1199150659));
        org.junit.Assert.assertTrue(i12 == 519545442);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4339), 132);
        int i24 = sumService0.add((-8474), (int) (short) 10);
        int i27 = sumService0.add(1524101379, (-349676777));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-4207));
        org.junit.Assert.assertTrue(i24 == (-8464));
        org.junit.Assert.assertTrue(i27 == 1174424602);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
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
        int i30 = multiplyService0.multiply(1700877488, 3209);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == (-787574224));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add(132, (-1537067));
        int i18 = sumService0.add((-318), 53);
        int i21 = sumService0.add(559150539, 1704143264);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == (-1536935));
        org.junit.Assert.assertTrue(i18 == (-265));
        org.junit.Assert.assertTrue(i21 == (-2031673493));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(1759245869, 918681259);
        int i9 = sumService0.add(72908177, 36);
        int i12 = sumService0.add(130219616, 2037482854);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == (-1617040168));
        org.junit.Assert.assertTrue(i9 == 72908213);
        org.junit.Assert.assertTrue(i12 == (-2127264826));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(1163461537, (int) (byte) 1);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 1163461538);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add(1086, 73055080);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == 73056166);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(133, (int) (short) 1);
        int i18 = sumService0.add(0, (-713157760));
        int i21 = sumService0.add(1125541544, 1922224165);
        int i24 = sumService0.add(42, (-95502336));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 134);
        org.junit.Assert.assertTrue(i18 == (-713157760));
        org.junit.Assert.assertTrue(i21 == (-1247201587));
        org.junit.Assert.assertTrue(i24 == (-95502294));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add(319, 51450000);
        int i21 = sumService0.add(1, (-4391));
        int i24 = sumService0.add(377138625, 700);
        int i27 = sumService0.add(239438238, (-1822216637));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51450319);
        org.junit.Assert.assertTrue(i21 == (-4390));
        org.junit.Assert.assertTrue(i24 == 377139325);
        org.junit.Assert.assertTrue(i27 == (-1582778399));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-1), (-4392));
        int i12 = multiplyService0.multiply((-493126080), (-318));
        int i15 = multiplyService0.multiply((-1406278947), 376390144);
        int i18 = multiplyService0.multiply((-94498944), 1300656750);
        int i21 = multiplyService0.multiply(97, (-1128323824));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 810547712);
        org.junit.Assert.assertTrue(i18 == 340896000);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply(42, 100);
        int i27 = multiplyService0.multiply((-318), 51449979);
        int i30 = multiplyService0.multiply((-1021787121), (-478267292));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 4200);
        org.junit.Assert.assertTrue(i27 == 818775862);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add(134, (int) (byte) 100);
        int i24 = sumService0.add(914894345, 276);
        int i27 = sumService0.add((-1314387328), 548);
        int i30 = sumService0.add(3200, (-2142029584));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 234);
        org.junit.Assert.assertTrue(i24 == 914894621);
        org.junit.Assert.assertTrue(i27 == (-1314386780));
        org.junit.Assert.assertTrue(i30 == (-2142026384));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(266, 17785);
        int i18 = multiplyService0.multiply(749371392, 2369810);
        int i21 = multiplyService0.multiply(279389682, 1829254332);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 4730810);
        org.junit.Assert.assertTrue(i18 == 1920794624);
        org.junit.Assert.assertTrue(i21 == 1745159608);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(0, 379527007);
        int i12 = sumService0.add(1745159608, 93291856);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 379527007);
        org.junit.Assert.assertTrue(i12 == 1838451464);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply(0, 1328957751);
        int i30 = multiplyService0.multiply(653328384, 1467056384);
        int i33 = multiplyService0.multiply((-2122268672), (-1447446382));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 1895825408);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add((int) (byte) 10, 266);
        int i15 = sumService0.add((-1537200), 2604516);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 276);
        org.junit.Assert.assertTrue(i15 == 1067316);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add(319, 51450000);
        int i21 = sumService0.add(1, (-4391));
        int i24 = sumService0.add(3219, 377157165);
        int i27 = sumService0.add(1212483212, 10088);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51450319);
        org.junit.Assert.assertTrue(i21 == (-4390));
        org.junit.Assert.assertTrue(i24 == 377160384);
        org.junit.Assert.assertTrue(i27 == 1212493300);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(318, (int) (byte) 1);
        int i15 = sumService0.add(51450319, 17688);
        int i18 = sumService0.add((-626325562), 874002638);
        int i21 = sumService0.add((-912598985), 372678416);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 319);
        org.junit.Assert.assertTrue(i15 == 51468007);
        org.junit.Assert.assertTrue(i18 == 247677076);
        org.junit.Assert.assertTrue(i21 == (-539920569));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1470000, 1334161400);
        int i15 = sumService0.add(376390144, (-1652043432));
        int i18 = sumService0.add(805705705, (-42210176));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1335631400);
        org.junit.Assert.assertTrue(i15 == (-1275653288));
        org.junit.Assert.assertTrue(i18 == 763495529);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-13312), 31);
        int i24 = sumService0.add(1749943816, 516);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-13281));
        org.junit.Assert.assertTrue(i24 == 1749944332);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) 'a', 1382089355);
        int i12 = multiplyService0.multiply(51468007, (-31));
        int i15 = multiplyService0.multiply((-1607189544), 326142208);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 918681259);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 713463808);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add((-4391), (int) (short) 0);
        int i15 = sumService0.add((-4339), 10);
        int i18 = sumService0.add((-2081677312), (-1339282954));
        int i21 = sumService0.add((-1011378815), 882521996);
        int i24 = sumService0.add(31, 14560000);
        int i27 = sumService0.add((-187393323), 559154828);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == (-4391));
        org.junit.Assert.assertTrue(i15 == (-4329));
        org.junit.Assert.assertTrue(i18 == 874007030);
        org.junit.Assert.assertTrue(i21 == (-128856819));
        org.junit.Assert.assertTrue(i24 == 14560031);
        org.junit.Assert.assertTrue(i27 == 371761505);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((-912619971), 17688);
        int i15 = multiplyService0.multiply((-210011164), (int) (short) 0);
        int i18 = multiplyService0.multiply(154058306, (-1710872314));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == (-1934948680));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(14560032, 9);
        int i18 = sumService0.add((int) (short) 1, 1514633534);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 14560041);
        org.junit.Assert.assertTrue(i18 == 1514633535);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(100, 0);
        int i21 = multiplyService0.multiply(818775962, (-4329));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(2369842, (-319));
        int i21 = multiplyService0.multiply((-4361), (-787016052));
        int i24 = multiplyService0.multiply(1772188476, 11200);
        int i27 = multiplyService0.multiply((-930177930), 350);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 1467056384);
        org.junit.Assert.assertTrue(i27 == 855238996);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 701);
        int i15 = multiplyService0.multiply((-1084340254), 1427127348);
        int i18 = multiplyService0.multiply(1511356684, 1334161400);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-2145414680));
        org.junit.Assert.assertTrue(i18 == (-1983350880));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add(1164984832, 0);
        int i15 = sumService0.add(7791000, 241895294);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 1164984832);
        org.junit.Assert.assertTrue(i15 == 249686294);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 701);
        int i15 = multiplyService0.multiply((-1084340254), 1427127348);
        int i18 = multiplyService0.multiply(710279168, 1869567104);
        int i21 = multiplyService0.multiply((-2142026384), (-1319191084));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-2145414680));
        org.junit.Assert.assertTrue(i18 == 1660944384);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4339), 132);
        int i24 = sumService0.add((-4361), (-1));
        int i27 = sumService0.add(379527007, (-1296570913));
        int i30 = sumService0.add(1514633534, (-1116914032));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-4207));
        org.junit.Assert.assertTrue(i24 == (-4362));
        org.junit.Assert.assertTrue(i27 == (-917043906));
        org.junit.Assert.assertTrue(i30 == 397719502);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(350, 42);
        int i12 = multiplyService0.multiply(749034, 100);
        int i15 = multiplyService0.multiply((-4207), (-1008953315));
        int i18 = multiplyService0.multiply(647268744, 559154858);
        int i21 = multiplyService0.multiply((-104030208), 14833);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 14700);
        org.junit.Assert.assertTrue(i12 == 74903400);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1032027056));
        org.junit.Assert.assertTrue(i21 == (-1186816000));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add((-4391), (int) (short) 0);
        int i15 = sumService0.add(548, 0);
        int i18 = sumService0.add(193, (-713157760));
        int i21 = sumService0.add(1705840296, 1154199698);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == (-4391));
        org.junit.Assert.assertTrue(i15 == 548);
        org.junit.Assert.assertTrue(i18 == (-713157567));
        org.junit.Assert.assertTrue(i21 == (-1434927302));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(416, 1382088705);
        int i18 = sumService0.add(377138528, (int) (short) -1);
        int i21 = sumService0.add(0, (-210011164));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 1382089121);
        org.junit.Assert.assertTrue(i18 == 377138527);
        org.junit.Assert.assertTrue(i21 == (-210011164));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(292600, 289796093);
        int i15 = sumService0.add(0, 314712735);
        int i18 = sumService0.add((-1008953315), 1774052808);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 290088693);
        org.junit.Assert.assertTrue(i15 == 314712735);
        org.junit.Assert.assertTrue(i18 == 765099493);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((int) ' ', 133);
        int i24 = sumService0.add(867985636, 904202840);
        int i27 = sumService0.add(377138528, 1669197998);
        int i30 = sumService0.add(51467735, 1360967039);
        int i33 = sumService0.add((-250857605), (-1404225171));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == 165);
        org.junit.Assert.assertTrue(i24 == 1772188476);
        org.junit.Assert.assertTrue(i27 == 2046336526);
        org.junit.Assert.assertTrue(i30 == 1412434774);
        org.junit.Assert.assertTrue(i33 == (-1655082776));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add(180879360, 21632);
        int i24 = sumService0.add(818776312, (-1652866106));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == 180900992);
        org.junit.Assert.assertTrue(i24 == (-834089794));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply(9, 17842176);
        int i15 = multiplyService0.multiply(559175844, 14700);
        int i18 = multiplyService0.multiply((-628008130), 712613553);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 160579584);
        org.junit.Assert.assertTrue(i15 == (-682497744));
        org.junit.Assert.assertTrue(i18 == 555637214);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((-1296581284), (-678514911));
        int i9 = sumService0.add(763495529, 1155571369);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-1975096195));
        org.junit.Assert.assertTrue(i9 == 1919066898);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((int) ' ', 133);
        int i24 = sumService0.add(1909292992, (-1710872314));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == 165);
        org.junit.Assert.assertTrue(i24 == 198420678);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(67247920, 818775862);
        int i18 = sumService0.add(918681259, 1246373992);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == 886023782);
        org.junit.Assert.assertTrue(i18 == (-2129912045));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
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
        int i33 = multiplyService0.multiply((-2081677311), (-1116914032));
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
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(0, 1352000);
        int i21 = multiplyService0.multiply((-4390), 1382088705);
        int i24 = multiplyService0.multiply(0, (-4042));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1419374298);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(1809723162, 1663186358);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == (-822057776));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(51450010, (-19208));
        int i18 = multiplyService0.multiply(320, (-1296581284));
        int i21 = multiplyService0.multiply(18048, (-1339282954));
        int i24 = multiplyService0.multiply(1972692780, 1353836913);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 42800748);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add(132, (-1537067));
        int i18 = sumService0.add((-318), 53);
        int i21 = sumService0.add((-485898434), 377156815);
        int i24 = sumService0.add((-1743240681), (-900025667));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == (-1536935));
        org.junit.Assert.assertTrue(i18 == (-265));
        org.junit.Assert.assertTrue(i21 == (-108741619));
        org.junit.Assert.assertTrue(i24 == 1651700948);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(266, 17785);
        int i18 = multiplyService0.multiply(700, 3720);
        int i21 = multiplyService0.multiply(51450319, 0);
        int i24 = multiplyService0.multiply((int) (byte) 0, (-1992845653));
        int i27 = multiplyService0.multiply(1863708879, (-1373994118));
        int i30 = multiplyService0.multiply(1700492387, (-1129784712));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 4730810);
        org.junit.Assert.assertTrue(i18 == 2604000);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(2604516, (-1129784712));
        int i27 = sumService0.add((-1296581284), (-4329));
        int i30 = sumService0.add(920032939, 1759245869);
        int i33 = sumService0.add((-71587808), (-1404225171));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == (-1127180196));
        org.junit.Assert.assertTrue(i27 == (-1296585613));
        org.junit.Assert.assertTrue(i30 == (-1615688488));
        org.junit.Assert.assertTrue(i33 == (-1475812979));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply(51450319, 1335631400);
        int i24 = multiplyService0.multiply(872698769, (-861118659));
        int i27 = multiplyService0.multiply((-704669184), 1193568256);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == 904202840);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 2123366400);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply(51450319, 1335631400);
        int i24 = multiplyService0.multiply(1328961975, (-2083214511));
        int i27 = multiplyService0.multiply(0, (-4042));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == 904202840);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(350, 42);
        int i12 = multiplyService0.multiply(749034, 100);
        int i15 = multiplyService0.multiply((-4207), (-1008953315));
        int i18 = multiplyService0.multiply(214584351, (-1292427488));
        int i21 = multiplyService0.multiply(1328957751, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 14700);
        org.junit.Assert.assertTrue(i12 == 74903400);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add((int) (byte) 10, 266);
        int i15 = sumService0.add((int) (short) 1, 3200);
        int i18 = sumService0.add((-1731821184), 774557175);
        int i21 = sumService0.add(100, 319);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 276);
        org.junit.Assert.assertTrue(i15 == 3201);
        org.junit.Assert.assertTrue(i18 == (-957264009));
        org.junit.Assert.assertTrue(i21 == 419);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add((-1392072617), (-1959079348));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == 943815331);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(36, (-4402));
        int i21 = multiplyService0.multiply((-368954624), 154047299);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1411622656));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-364057955), 51450152);
        int i24 = sumService0.add(296574976, (-6778883));
        int i27 = sumService0.add((-1077152773), 420000);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-312607803));
        org.junit.Assert.assertTrue(i24 == 289796093);
        org.junit.Assert.assertTrue(i27 == (-1076732773));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add(2069684240, (-1871938824));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == 197745416);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((-349672704), (-661706111));
        int i18 = sumService0.add((-1612238578), (-1249959424));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == (-1011378815));
        org.junit.Assert.assertTrue(i18 == 1432769294);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply((-1296578083), 0);
        int i24 = multiplyService0.multiply((-1220810752), 1894292752);
        int i27 = multiplyService0.multiply(198420678, 2369810);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 1896251392);
        org.junit.Assert.assertTrue(i27 == 1992397804);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((int) (short) 0, 31);
        int i18 = multiplyService0.multiply((-4084), 559154858);
        int i21 = multiplyService0.multiply(1457160878, 818801750);
        int i24 = multiplyService0.multiply(0, (-13047));
        int i27 = multiplyService0.multiply((-150844453), 51454210);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1334161400);
        org.junit.Assert.assertTrue(i21 == (-482980236));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-732507466));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(1, (int) (short) 10);
        int i15 = multiplyService0.multiply(315188986, (-1346170880));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply(249110840, 14560000);
        int i15 = multiplyService0.multiply(275679888, 214584351);
        int i18 = multiplyService0.multiply((-1731821051), 1759263629);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 1193568256);
        org.junit.Assert.assertTrue(i15 == (-467302544));
        org.junit.Assert.assertTrue(i18 == (-1449606207));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply(914908945, 51450000);
        int i18 = multiplyService0.multiply((-1629091072), 1942661936);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 1045170576);
        org.junit.Assert.assertTrue(i18 == 578490368);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(492634112, 457466384);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1875902464);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(904202840, 1920794624);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 1022885888);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(377139325, 11200);
        int i21 = sumService0.add(1328957751, (-72237792));
        int i24 = sumService0.add(101, 1829254332);
        int i27 = sumService0.add(165, 755727000);
        int i30 = sumService0.add((-1), 51467735);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 377150525);
        org.junit.Assert.assertTrue(i21 == 1256719959);
        org.junit.Assert.assertTrue(i24 == 1829254433);
        org.junit.Assert.assertTrue(i27 == 755727165);
        org.junit.Assert.assertTrue(i30 == 51467734);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(559154858, 320);
        int i21 = multiplyService0.multiply(0, (-827083360));
        int i24 = multiplyService0.multiply(1290506454, 874002638);
        int i27 = multiplyService0.multiply(648376867, 217329481);
        int i30 = multiplyService0.multiply((-4084), 889227178);
        int i33 = multiplyService0.multiply((-31), (-236821640));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1459071872));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 2035113012);
        org.junit.Assert.assertTrue(i27 == (-763496197));
        org.junit.Assert.assertTrue(i30 == 1938537464);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply(712023936, 377139325);
        int i24 = multiplyService0.multiply((-1629091072), 0);
        int i27 = multiplyService0.multiply(559150467, (-1249303706));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == 698737024);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply(700, 915475213);
        int i15 = multiplyService0.multiply(0, 160579584);
        int i18 = multiplyService0.multiply((-1669734140), 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 882521996);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply((int) (byte) -1, 379527007);
        int i24 = multiplyService0.multiply(1030089, 325338392);
        int i27 = multiplyService0.multiply(818780118, (-1095912125));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == (-379527007));
        org.junit.Assert.assertTrue(i24 == (-209295400));
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(133, (int) (short) 1);
        int i18 = sumService0.add(614305168, 0);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 134);
        org.junit.Assert.assertTrue(i18 == 614305168);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply(4256, 11937480);
        int i18 = multiplyService0.multiply((-762192983), 154047299);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == (-733692672));
        org.junit.Assert.assertTrue(i18 == 1185712187);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(261704448, 749371392);
        int i18 = multiplyService0.multiply((-4073), (-1481422540));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1937768448);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(1386193495, (-1798394867));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
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
        int i30 = multiplyService0.multiply(817256823, 289796093);
        int i33 = multiplyService0.multiply((-2127264826), 1758382896);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 1922224165);
        org.junit.Assert.assertTrue(i30 == 1708098459);
        org.junit.Assert.assertTrue(i33 == 1470805792);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((-1127180196), (-349672704));
        int i15 = multiplyService0.multiply((-1888865072), (-2367493));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(2370192, 386);
        int i24 = multiplyService0.multiply((-1), 1296581284);
        int i27 = multiplyService0.multiply(17842176, 42);
        int i30 = multiplyService0.multiply(1469621687, 97);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == (-1296581284));
        org.junit.Assert.assertTrue(i27 == 749371392);
        org.junit.Assert.assertTrue(i30 == 819382871);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 4200);
        int i15 = multiplyService0.multiply((-1), (-31));
        int i18 = multiplyService0.multiply(51450297, (int) (byte) 1);
        int i21 = multiplyService0.multiply((-733692672), (-1077467365));
        int i24 = multiplyService0.multiply((-1296581151), 4224);
        int i27 = multiplyService0.multiply((-953541388), 765099493);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 51450297);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == (-675479424));
        org.junit.Assert.assertTrue(i27 == 127339076);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((-451133912), 0);
        int i15 = multiplyService0.multiply(14560000, 1348052926);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-2047809024));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 914894112);
        int i15 = sumService0.add((-1533480), 377138528);
        int i18 = sumService0.add((-1008953315), (-6778883));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 914894245);
        org.junit.Assert.assertTrue(i15 == 375605048);
        org.junit.Assert.assertTrue(i18 == (-1015732198));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((-1639689807), (-1015732198));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1639545291);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(1829254433, (-579055083));
        int i15 = sumService0.add(920032939, (-1871938824));
        int i18 = sumService0.add((-13147), 1863708879);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 1250199350);
        org.junit.Assert.assertTrue(i15 == (-951905885));
        org.junit.Assert.assertTrue(i18 == 1863695732);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(67247920, 5660160);
        int i18 = sumService0.add(1474200, (int) '#');
        int i21 = sumService0.add((-258687196), (-2142029584));
        int i24 = sumService0.add(1677466068, 2138772876);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == 72908080);
        org.junit.Assert.assertTrue(i18 == 1474235);
        org.junit.Assert.assertTrue(i21 == 1894250516);
        org.junit.Assert.assertTrue(i24 == (-478728352));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (byte) -1, 0);
        int i15 = multiplyService0.multiply(0, (int) ' ');
        int i18 = multiplyService0.multiply((-27034880), 2096518976);
        int i21 = multiplyService0.multiply(1467056384, (-1249303334));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1716797440));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(14560032, 9);
        int i18 = sumService0.add(160575202, 20986);
        int i21 = sumService0.add(379527007, 2046336526);
        int i24 = sumService0.add(438817792, (-1338758104));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 14560041);
        org.junit.Assert.assertTrue(i18 == 160596188);
        org.junit.Assert.assertTrue(i21 == (-1869103763));
        org.junit.Assert.assertTrue(i24 == (-899940312));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, 914908945);
        int i15 = multiplyService0.multiply(217329481, 1309517028);
        int i18 = multiplyService0.multiply(578490368, 147000);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 559154858);
        org.junit.Assert.assertTrue(i15 == (-1669734140));
        org.junit.Assert.assertTrue(i18 == 2026602496);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add((-13147), 559154859);
        int i21 = sumService0.add(160586392, 164752000);
        int i24 = sumService0.add(805705705, 101);
        int i27 = sumService0.add(275679888, (-13070257));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 559141712);
        org.junit.Assert.assertTrue(i21 == 325338392);
        org.junit.Assert.assertTrue(i24 == 805705806);
        org.junit.Assert.assertTrue(i27 == 262609631);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply(712023936, 377139325);
        int i24 = multiplyService0.multiply(874018230, (int) (short) 1);
        int i27 = multiplyService0.multiply(494701244, 152);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == 698737024);
        org.junit.Assert.assertTrue(i24 == 874018230);
        org.junit.Assert.assertTrue(i27 == (-2114822240));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply(9, 17842176);
        int i15 = multiplyService0.multiply(559175844, 14700);
        int i18 = multiplyService0.multiply((-1798394867), (-1975096195));
        int i21 = multiplyService0.multiply((-2016054821), (-4084));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 160579584);
        org.junit.Assert.assertTrue(i15 == (-682497744));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(1292047473, (-1541019));
        int i15 = sumService0.add(51436699, (-1757766714));
        int i18 = sumService0.add(2425500, 134);
        int i21 = sumService0.add(1708098459, (-2081677312));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 1290506454);
        org.junit.Assert.assertTrue(i15 == (-1706330015));
        org.junit.Assert.assertTrue(i18 == 2425634);
        org.junit.Assert.assertTrue(i21 == (-373578853));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 701);
        int i15 = multiplyService0.multiply(818776312, 51450997);
        int i18 = multiplyService0.multiply(51450000, (-462914307));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1562048856);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(51450010, (-19208));
        int i18 = multiplyService0.multiply(36, 516);
        int i21 = multiplyService0.multiply(1372804491, (-726304512));
        int i24 = multiplyService0.multiply(396322690, (-2144686191));
        int i27 = multiplyService0.multiply(1166302803, (-83));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 18576);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(0, 234);
        int i12 = multiplyService0.multiply(2090968902, (-1620822858));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add((-1537200), 438817792);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 437280592);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(14700, (int) (short) 10);
        int i9 = sumService0.add(14701, 0);
        int i12 = sumService0.add((-4207), (-1077463158));
        int i15 = sumService0.add((-4362), 296574976);
        int i18 = sumService0.add((-1975096195), 346332000);
        int i21 = sumService0.add(1427127348, 1334161497);
        int i24 = sumService0.add((-319), (-682811664));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 14710);
        org.junit.Assert.assertTrue(i9 == 14701);
        org.junit.Assert.assertTrue(i12 == (-1077467365));
        org.junit.Assert.assertTrue(i15 == 296570614);
        org.junit.Assert.assertTrue(i18 == (-1628764195));
        org.junit.Assert.assertTrue(i21 == (-1533678451));
        org.junit.Assert.assertTrue(i24 == (-682811983));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add((-1537200), 0);
        int i24 = sumService0.add((-2122268672), (-1381463152));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == (-1537200));
        org.junit.Assert.assertTrue(i24 == 791235472);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(51450000, (int) (byte) 10);
        int i15 = sumService0.add(1797416241, 1669197998);
        int i18 = sumService0.add(897633037, (-1011378815));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 51450010);
        org.junit.Assert.assertTrue(i15 == (-828353057));
        org.junit.Assert.assertTrue(i18 == (-113745778));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add(180879360, 21632);
        int i24 = sumService0.add(1163461537, (-223088463));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == 180900992);
        org.junit.Assert.assertTrue(i24 == 940373074);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply((-1075101257), (-364057955));
        int i21 = multiplyService0.multiply(1, (-1330523392));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add((int) (byte) 10, 266);
        int i15 = sumService0.add((int) (short) 1, 3200);
        int i18 = sumService0.add((-1541019), 17724);
        int i21 = sumService0.add((-1546294936), 334946989);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 276);
        org.junit.Assert.assertTrue(i15 == 3201);
        org.junit.Assert.assertTrue(i18 == (-1523295));
        org.junit.Assert.assertTrue(i21 == (-1211347947));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add(142, 755727000);
        int i18 = sumService0.add(845447382, 2366108);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 755727142);
        org.junit.Assert.assertTrue(i18 == 847813490);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(51450011, (-1296570913));
        int i18 = multiplyService0.multiply((-1095952965), 377156815);
        int i21 = multiplyService0.multiply((-1679585984), (-1275653288));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1815556555));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(1759245869, 918681259);
        int i9 = sumService0.add(72908177, 36);
        int i12 = sumService0.add(1922224165, (-1537067));
        int i15 = sumService0.add(1863708879, (-1107197120));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == (-1617040168));
        org.junit.Assert.assertTrue(i9 == 72908213);
        org.junit.Assert.assertTrue(i12 == 1920687098);
        org.junit.Assert.assertTrue(i15 == 756511759);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add((-32), 42);
        int i21 = sumService0.add((-1077445373), (-1536935));
        int i24 = sumService0.add((-953556088), 14700);
        int i27 = sumService0.add(521082377, 1514633535);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertTrue(i21 == (-1078982308));
        org.junit.Assert.assertTrue(i24 == (-953541388));
        org.junit.Assert.assertTrue(i27 == 2035715912);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add((-1116914032), (int) (short) 1);
        int i15 = sumService0.add(1470000, 7791000);
        int i18 = sumService0.add(968434048, (-2145414680));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == (-1116914031));
        org.junit.Assert.assertTrue(i15 == 9261000);
        org.junit.Assert.assertTrue(i18 == (-1176980632));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add((-4391), 1335631400);
        int i12 = sumService0.add((-2136905344), 1);
        int i15 = sumService0.add(1916619352, 1328957751);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 1335627009);
        org.junit.Assert.assertTrue(i12 == (-2136905343));
        org.junit.Assert.assertTrue(i15 == (-1049390193));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply(1296581284, (int) (short) 1);
        int i15 = multiplyService0.multiply(53, 147000);
        int i18 = multiplyService0.multiply((-1612238578), (-42210176));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 7791000);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '4', 416);
        int i9 = multiplyService0.multiply((-1612238578), 2090968902);
        int i12 = multiplyService0.multiply(763495529, 3528);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 21632);
        org.junit.Assert.assertTrue(i9 == 738560980);
        org.junit.Assert.assertTrue(i12 == 667731720);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(160586392, (-1296578083));
        int i15 = multiplyService0.multiply(0, (-362705955));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply((-318), 882521996);
        int i21 = multiplyService0.multiply(1710392717, (-265));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == (-1469120488));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-4207), 2370192);
        int i12 = multiplyService0.multiply((-1077467365), 379527007);
        int i15 = multiplyService0.multiply(371761505, (-1430731640));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1381463152));
        org.junit.Assert.assertTrue(i12 == (-462895099));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
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
        int i33 = multiplyService0.multiply(1720648459, 1706919829);
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
        org.junit.Assert.assertTrue(i33 == (-1309240729));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add((-400482011), 967253556);
        int i12 = sumService0.add(142213136, 394431159);
        int i15 = sumService0.add(42800748, 1460888);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 566771545);
        org.junit.Assert.assertTrue(i12 == 536644295);
        org.junit.Assert.assertTrue(i15 == 44261636);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add(132, (-1537067));
        int i18 = sumService0.add((-912599118), 1290506454);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == (-1536935));
        org.junit.Assert.assertTrue(i18 == 377907336);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(379504635, 10);
        int i15 = sumService0.add((-1019873136), (-8474));
        int i18 = sumService0.add((-108741619), (-4361));
        int i21 = sumService0.add(133, 1086);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 379504645);
        org.junit.Assert.assertTrue(i15 == (-1019881610));
        org.junit.Assert.assertTrue(i18 == (-108745980));
        org.junit.Assert.assertTrue(i21 == 1219);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((int) (short) 0, 31);
        int i18 = multiplyService0.multiply((-4084), 559154858);
        int i21 = multiplyService0.multiply(1457160878, 818801750);
        int i24 = multiplyService0.multiply(0, (-13047));
        int i27 = multiplyService0.multiply((-349672704), 1328957751);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1334161400);
        org.junit.Assert.assertTrue(i21 == (-482980236));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-1640891136));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) (short) 100, 818775862);
        int i12 = sumService0.add((-290783232), (-319));
        int i15 = sumService0.add((-661706111), 1351680);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 818775962);
        org.junit.Assert.assertTrue(i12 == (-290783551));
        org.junit.Assert.assertTrue(i15 == (-660354431));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (byte) -1, 0);
        int i15 = multiplyService0.multiply(0, (int) ' ');
        int i18 = multiplyService0.multiply((-27034880), 2096518976);
        int i21 = multiplyService0.multiply((-1247201587), (-1947786240));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1716797440));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(0, 1352000);
        int i21 = multiplyService0.multiply(874007030, 1500648960);
        int i24 = multiplyService0.multiply(180879360, (-1062015850));
        int i27 = multiplyService0.multiply(377150525, 1309516928);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1947786240));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-1214369152));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add(236990794, 4256);
        int i21 = sumService0.add(1030089, 1335631400);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 236995050);
        org.junit.Assert.assertTrue(i21 == 1336661489);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(4200, (int) (byte) 0);
        int i18 = multiplyService0.multiply((-6778883), 236990600);
        int i21 = multiplyService0.multiply((-1335626144), (-349672704));
        int i24 = multiplyService0.multiply(872698769, (int) (byte) 10);
        int i27 = multiplyService0.multiply(0, (-4390));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 967569000);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 137053098);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply(0, 1328957751);
        int i30 = multiplyService0.multiply(855238996, 1599313021);
        int i33 = multiplyService0.multiply(214584482, (-13047));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 824671748);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add(0, (-679303244));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-679303244));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 1, 236990600);
        int i15 = multiplyService0.multiply(292600, (int) (byte) -1);
        int i18 = multiplyService0.multiply((-831258624), (-713157760));
        int i21 = multiplyService0.multiply(176873048, 1670738110);
        int i24 = multiplyService0.multiply(494701244, (-1612709888));
        int i27 = multiplyService0.multiply(885292675, 2369842);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 93291856);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-1861242730));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add((-223168260), (-451133912));
        int i24 = sumService0.add(72908177, (-2144686191));
        int i27 = sumService0.add(296574976, (-483968299));
        int i30 = sumService0.add((-2071778014), 1923399140);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == (-674302172));
        org.junit.Assert.assertTrue(i24 == (-2071778014));
        org.junit.Assert.assertTrue(i27 == (-187393323));
        org.junit.Assert.assertTrue(i30 == (-148378874));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((-32), 350);
        int i9 = sumService0.add((int) (short) -1, (int) (byte) 10);
        int i12 = sumService0.add((-726304512), (-1652043432));
        int i15 = sumService0.add((-343474176), (-1077445373));
        int i18 = sumService0.add(1336661489, (-1077463158));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 318);
        org.junit.Assert.assertTrue(i9 == 9);
        org.junit.Assert.assertTrue(i12 == 1916619352);
        org.junit.Assert.assertTrue(i15 == (-1420919549));
        org.junit.Assert.assertTrue(i18 == 259198331);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply((-762192930), 11904);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 2121257728);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(920032939, 11904);
        int i18 = multiplyService0.multiply(818776312, 1894292752);
        int i21 = multiplyService0.multiply(0, (-787016052));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-94498944));
        org.junit.Assert.assertTrue(i18 == (-1164400768));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(51450010, (-19208));
        int i18 = multiplyService0.multiply(36, 516);
        int i21 = multiplyService0.multiply(904202840, (-711503682));
        int i24 = multiplyService0.multiply(469, 318);
        int i27 = multiplyService0.multiply(1599313021, 375605048);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 18576);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 149142);
        org.junit.Assert.assertTrue(i27 == 852371032);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(319, 97);
        int i18 = sumService0.add((int) (short) 1, (-912620105));
        int i21 = sumService0.add(11200, 559154858);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 416);
        org.junit.Assert.assertTrue(i18 == (-912620104));
        org.junit.Assert.assertTrue(i21 == 559166058);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(266, 17785);
        int i18 = multiplyService0.multiply(700, 3720);
        int i21 = multiplyService0.multiply(51450319, 0);
        int i24 = multiplyService0.multiply((int) (byte) 0, (-1992845653));
        int i27 = multiplyService0.multiply(131, 234);
        int i30 = multiplyService0.multiply((int) (byte) 100, 1067316);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 4730810);
        org.junit.Assert.assertTrue(i18 == 2604000);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 30654);
        org.junit.Assert.assertTrue(i30 == 106731600);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(559154859, (-4392));
        int i12 = sumService0.add((int) (byte) 10, 160575192);
        int i15 = sumService0.add(51450319, 142);
        int i18 = sumService0.add(1660944384, (-912620104));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 559150467);
        org.junit.Assert.assertTrue(i12 == 160575202);
        org.junit.Assert.assertTrue(i15 == 51450461);
        org.junit.Assert.assertTrue(i18 == 748324280);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(53, 1);
        int i18 = multiplyService0.multiply(1961448629, 904202840);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 53);
        org.junit.Assert.assertTrue(i18 == (-1939001288));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply((-318), 882521996);
        int i21 = multiplyService0.multiply((-761142983), (-250857605));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == (-1469120488));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 516);
        int i15 = sumService0.add(1, 76440000);
        int i18 = sumService0.add((-4329), (int) (byte) 10);
        int i21 = sumService0.add((-1481422540), (-2130442612));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 548);
        org.junit.Assert.assertTrue(i15 == 76440001);
        org.junit.Assert.assertTrue(i18 == (-4319));
        org.junit.Assert.assertTrue(i21 == 683102144);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply((int) ' ', (-4084));
        int i15 = multiplyService0.multiply((-4339), (-737134487));
        int i18 = multiplyService0.multiply(2425500, 134);
        int i21 = multiplyService0.multiply((-711503682), (-840472364));
        int i24 = multiplyService0.multiply(2369874, 1152773688);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 325017000);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == (-1521662480));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add(1382088704, (-2081677312));
        int i15 = sumService0.add(17785, 818780118);
        int i18 = sumService0.add(133, (-1731821184));
        int i21 = sumService0.add((-368954624), 0);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == (-699588608));
        org.junit.Assert.assertTrue(i15 == 818797903);
        org.junit.Assert.assertTrue(i18 == (-1731821051));
        org.junit.Assert.assertTrue(i21 == (-368954624));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(319, 97);
        int i18 = sumService0.add(377156815, 350);
        int i21 = sumService0.add(196083712, 1839793749);
        int i24 = sumService0.add(1511356684, (-1869103763));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 416);
        org.junit.Assert.assertTrue(i18 == 377157165);
        org.junit.Assert.assertTrue(i21 == 2035877461);
        org.junit.Assert.assertTrue(i24 == (-357747079));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(700, 386);
        int i18 = sumService0.add((-1975096195), 217329481);
        int i21 = sumService0.add(0, (-482980236));
        int i24 = sumService0.add((-13312), (-4207));
        int i27 = sumService0.add(73056166, (-318));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1086);
        org.junit.Assert.assertTrue(i18 == (-1757766714));
        org.junit.Assert.assertTrue(i21 == (-482980236));
        org.junit.Assert.assertTrue(i24 == (-17519));
        org.junit.Assert.assertTrue(i27 == 73055848);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(51450000, (int) (byte) 10);
        int i15 = sumService0.add(318, 17730);
        int i18 = sumService0.add(1720648459, (-912620105));
        int i21 = sumService0.add(104900608, (-1757766714));
        int i24 = sumService0.add((-108741619), 465322240);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 51450010);
        org.junit.Assert.assertTrue(i15 == 18048);
        org.junit.Assert.assertTrue(i18 == 808028354);
        org.junit.Assert.assertTrue(i21 == (-1652866106));
        org.junit.Assert.assertTrue(i24 == 356580621);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(1230234744, 320);
        int i21 = multiplyService0.multiply((-1077612250), 14710);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1461873152));
        org.junit.Assert.assertTrue(i21 == 1048092036);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add(132, (-1537067));
        int i18 = sumService0.add((-318), 53);
        int i21 = sumService0.add(1761760944, (-1008953315));
        int i24 = sumService0.add((-1620822858), 10);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == (-1536935));
        org.junit.Assert.assertTrue(i18 == (-265));
        org.junit.Assert.assertTrue(i21 == 752807629);
        org.junit.Assert.assertTrue(i24 == (-1620822848));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(9, 194);
        int i12 = sumService0.add(160596188, 296574976);
        int i15 = sumService0.add((-1076953436), 72908177);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 203);
        org.junit.Assert.assertTrue(i12 == 457171164);
        org.junit.Assert.assertTrue(i15 == (-1004045259));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(1292047473, (-1541019));
        int i15 = sumService0.add(51436699, (-1757766714));
        int i18 = sumService0.add(2425500, 134);
        int i21 = sumService0.add(578490368, 127339076);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 1290506454);
        org.junit.Assert.assertTrue(i15 == (-1706330015));
        org.junit.Assert.assertTrue(i18 == 2425634);
        org.junit.Assert.assertTrue(i21 == 705829444);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply(42, 377156815);
        int i12 = multiplyService0.multiply(3209, 321);
        int i15 = multiplyService0.multiply(1382088704, (-2081677312));
        int i18 = multiplyService0.multiply((-1835290376), 236995050);
        int i21 = multiplyService0.multiply((-375706160), 502029631);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1339282954));
        org.junit.Assert.assertTrue(i12 == 1030089);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 960412336);
        org.junit.Assert.assertTrue(i21 == (-1466640848));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add((-4392), (int) (byte) 1);
        int i12 = sumService0.add((-13129), (-2081677312));
        int i15 = sumService0.add(647268744, 18048);
        int i18 = sumService0.add((-4339), 2121257728);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == (-4391));
        org.junit.Assert.assertTrue(i12 == (-2081690441));
        org.junit.Assert.assertTrue(i15 == 647286792);
        org.junit.Assert.assertTrue(i18 == 2121253389);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(3720, 1309516928);
        int i27 = sumService0.add((-1498897379), 92618432);
        int i30 = sumService0.add(0, 642401459);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1309520648);
        org.junit.Assert.assertTrue(i27 == (-1406278947));
        org.junit.Assert.assertTrue(i30 == 642401459);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add(17785, 914894621);
        int i21 = sumService0.add((-1629091072), (-1346170880));
        int i24 = sumService0.add(152, 1514633534);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == 914912406);
        org.junit.Assert.assertTrue(i21 == 1319705344);
        org.junit.Assert.assertTrue(i24 == 1514633686);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-4073), 3209);
        int i15 = multiplyService0.multiply(698737024, 818775962);
        int i18 = multiplyService0.multiply(100, (-828353057));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == (-13070257));
        org.junit.Assert.assertTrue(i15 == 456402688);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((-32), 350);
        int i9 = sumService0.add((int) (short) -1, (int) (byte) 10);
        int i12 = sumService0.add((-626325562), 363774046);
        int i15 = sumService0.add((-912620105), (-1861242730));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 318);
        org.junit.Assert.assertTrue(i9 == 9);
        org.junit.Assert.assertTrue(i12 == (-262551516));
        org.junit.Assert.assertTrue(i15 == 1521104461);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add(1309520648, 1382089121);
        int i24 = sumService0.add((-626325562), 350);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == (-1603357527));
        org.junit.Assert.assertTrue(i24 == (-626325212));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add(1382088704, (-2081677312));
        int i15 = sumService0.add(18190, (int) (byte) 0);
        int i18 = sumService0.add((-4391), (-2081690441));
        int i21 = sumService0.add((-778535468), 1089162661);
        int i24 = sumService0.add((-661706111), 3528);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == (-699588608));
        org.junit.Assert.assertTrue(i15 == 18190);
        org.junit.Assert.assertTrue(i18 == (-2081694832));
        org.junit.Assert.assertTrue(i21 == 310627193);
        org.junit.Assert.assertTrue(i24 == (-661702583));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add((-83), 0);
        int i21 = sumService0.add((-32), 918681259);
        int i24 = sumService0.add((-8464), 867985636);
        int i27 = sumService0.add(893767818, 0);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == (-83));
        org.junit.Assert.assertTrue(i21 == 918681227);
        org.junit.Assert.assertTrue(i24 == 867977172);
        org.junit.Assert.assertTrue(i27 == 893767818);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(133, (-1537200));
        int i15 = sumService0.add(1474200, (-318));
        int i18 = sumService0.add((-701061925), 1620577792);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == (-1537067));
        org.junit.Assert.assertTrue(i15 == 1473882);
        org.junit.Assert.assertTrue(i18 == 919515867);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-31), 51450010);
        int i21 = sumService0.add((-4339), 132);
        int i24 = sumService0.add((-4361), (-1));
        int i27 = sumService0.add(379527007, (-1296570913));
        int i30 = sumService0.add((-1620827082), 4224);
        int i33 = sumService0.add((-13312), 0);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 51449979);
        org.junit.Assert.assertTrue(i21 == (-4207));
        org.junit.Assert.assertTrue(i24 == (-4362));
        org.junit.Assert.assertTrue(i27 == (-917043906));
        org.junit.Assert.assertTrue(i30 == (-1620822858));
        org.junit.Assert.assertTrue(i33 == (-13312));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add(17785, 914894621);
        int i21 = sumService0.add((-1629091072), (-1346170880));
        int i24 = sumService0.add(1309517028, (-1969079032));
        int i27 = sumService0.add(180900992, 1775651032);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == 914912406);
        org.junit.Assert.assertTrue(i21 == 1319705344);
        org.junit.Assert.assertTrue(i24 == (-659562004));
        org.junit.Assert.assertTrue(i27 == 1956552024);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(700, 386);
        int i18 = sumService0.add((-1975096195), 217329481);
        int i21 = sumService0.add(155534506, 1);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1086);
        org.junit.Assert.assertTrue(i18 == (-1757766714));
        org.junit.Assert.assertTrue(i21 == 155534507);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 516);
        int i15 = sumService0.add((-957264009), 14710);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 548);
        org.junit.Assert.assertTrue(i15 == (-957249299));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(1, 0);
        int i9 = sumService0.add((-1296581284), 3201);
        int i12 = sumService0.add((-290783551), (-1049390193));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i9 == (-1296578083));
        org.junit.Assert.assertTrue(i12 == (-1340173744));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-4073), 3209);
        int i15 = multiplyService0.multiply(698737024, 818775962);
        int i18 = multiplyService0.multiply((-708836419), 1873693507);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == (-13070257));
        org.junit.Assert.assertTrue(i15 == 456402688);
        org.junit.Assert.assertTrue(i18 == (-1345365641));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(3209, 319);
        int i9 = sumService0.add(35515, (-778570983));
        int i12 = sumService0.add((-1346170880), 4200);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 3528);
        org.junit.Assert.assertTrue(i9 == (-778535468));
        org.junit.Assert.assertTrue(i12 == (-1346166680));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(319, 97);
        int i18 = sumService0.add(914908945, 0);
        int i21 = sumService0.add(249686294, 502029631);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 416);
        org.junit.Assert.assertTrue(i18 == 914908945);
        org.junit.Assert.assertTrue(i21 == 751715925);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
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
        int i30 = multiplyService0.multiply(377157165, 194);
        int i33 = multiplyService0.multiply((-1295513760), 1474200);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 154045978);
        org.junit.Assert.assertTrue(i33 == 1017487616);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply((-32), 416);
        int i24 = multiplyService0.multiply(276, 296570614);
        int i27 = multiplyService0.multiply(1614205120, 160575193);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 249110840);
        org.junit.Assert.assertTrue(i27 == 897151680);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(920032939, 11904);
        int i18 = multiplyService0.multiply(51445671, 2121257728);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-94498944));
        org.junit.Assert.assertTrue(i18 == 236954880);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add(0, 51454210);
        int i21 = sumService0.add((-1629479311), 595110372);
        int i24 = sumService0.add(377156815, (-912620104));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == 51454210);
        org.junit.Assert.assertTrue(i21 == (-1034368939));
        org.junit.Assert.assertTrue(i24 == (-535463289));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
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
        int i33 = multiplyService0.multiply((-1032027056), 2365482);
        int i36 = multiplyService0.multiply(104900608, (-43733471));
        int i39 = multiplyService0.multiply(3219, 1353836913);
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
        org.junit.Assert.assertTrue(i33 == 806696224);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i39 == (-1390782493));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add(17760, 1759245869);
        int i21 = sumService0.add(712023936, 377138725);
        int i24 = sumService0.add(1500649660, (-2079704743));
        int i27 = sumService0.add((-912620105), (-1912725504));
        int i30 = sumService0.add((-1541019), 1266571157);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == 1759263629);
        org.junit.Assert.assertTrue(i21 == 1089162661);
        org.junit.Assert.assertTrue(i24 == (-579055083));
        org.junit.Assert.assertTrue(i27 == 1469621687);
        org.junit.Assert.assertTrue(i30 == 1265030138);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add((-1537200), 0);
        int i24 = sumService0.add(17842176, 373424552);
        int i27 = sumService0.add((-1992845653), (-1604198979));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == (-1537200));
        org.junit.Assert.assertTrue(i24 == 391266728);
        org.junit.Assert.assertTrue(i27 == 697922664);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply(236990600, (-319));
        int i18 = multiplyService0.multiply(51450000, 20064);
        int i21 = multiplyService0.multiply(882521996, 559154858);
        int i24 = multiplyService0.multiply(1496602186, 14560041);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1500648960);
        org.junit.Assert.assertTrue(i21 == (-777639176));
        org.junit.Assert.assertTrue(i24 == (-401850406));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(0, (-1607189544));
        int i15 = sumService0.add(914894345, 1759245869);
        int i18 = sumService0.add((-210011484), 386);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == (-1607189544));
        org.junit.Assert.assertTrue(i15 == (-1620827082));
        org.junit.Assert.assertTrue(i18 == (-210011098));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(0, (-1607189544));
        int i15 = sumService0.add(914894345, 1759245869);
        int i18 = sumService0.add(97, 1496602044);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == (-1607189544));
        org.junit.Assert.assertTrue(i15 == (-1620827082));
        org.junit.Assert.assertTrue(i18 == 1496602141);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add(350, 350);
        int i12 = sumService0.add((-1537067), 51450011);
        int i15 = sumService0.add((-957249299), (-4402));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 700);
        org.junit.Assert.assertTrue(i12 == 49912944);
        org.junit.Assert.assertTrue(i15 == (-957253701));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(379504635, 10);
        int i15 = sumService0.add((-440237056), 555637214);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 379504645);
        org.junit.Assert.assertTrue(i15 == 115400158);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-1339282954), (int) ' ');
        int i15 = multiplyService0.multiply((-444431728), 904202840);
        int i18 = multiplyService0.multiply(1467056384, 14560000);
        int i21 = multiplyService0.multiply(1334161497, 92618432);
        int i24 = multiplyService0.multiply(0, 11904);
        int i27 = multiplyService0.multiply(1212483212, (-1176980632));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 92618432);
        org.junit.Assert.assertTrue(i15 == (-1731821184));
        org.junit.Assert.assertTrue(i18 == (-290783232));
        org.junit.Assert.assertTrue(i21 == 1614205120);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) 'a', 1382089355);
        int i12 = multiplyService0.multiply(0, 1923399140);
        int i15 = multiplyService0.multiply(2013399069, 21632);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 918681259);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-1414688128));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((-1392072616), (int) (byte) 0);
        int i18 = multiplyService0.multiply(1351680, 0);
        int i21 = multiplyService0.multiply(1599313341, 377150557);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 270389673);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(3209, (int) (byte) 1);
        int i15 = multiplyService0.multiply(1360967039, (-90282413));
        int i18 = multiplyService0.multiply(562888622, (-660354431));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(350, 42);
        int i12 = multiplyService0.multiply(749034, 100);
        int i15 = multiplyService0.multiply((-4207), (-1008953315));
        int i18 = multiplyService0.multiply(647268744, 559154858);
        int i21 = multiplyService0.multiply((-7245632), 893767666);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 14700);
        org.junit.Assert.assertTrue(i12 == 74903400);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1032027056));
        org.junit.Assert.assertTrue(i21 == 1432868224);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(882521996, 17785);
        int i15 = sumService0.add((-1095912125), (-357747079));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == 882539781);
        org.junit.Assert.assertTrue(i15 == (-1453659204));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((-83), (-912599118));
        int i9 = multiplyService0.multiply(643212544, 1758382896);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1424625664));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
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
        int i33 = multiplyService0.multiply(1838451464, 51468007);
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
        org.junit.Assert.assertTrue(i33 == 457581624);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((-1296581284), (-678514911));
        int i9 = sumService0.add(3201, 17785);
        int i12 = sumService0.add((-1827514450), (-1947786240));
        int i15 = sumService0.add((-912620105), (-2081690441));
        int i18 = sumService0.add((-861118659), (-2122268672));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-1975096195));
        org.junit.Assert.assertTrue(i9 == 20986);
        org.junit.Assert.assertTrue(i12 == 519666606);
        org.junit.Assert.assertTrue(i15 == 1300656750);
        org.junit.Assert.assertTrue(i18 == 1311579965);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply((-32), 416);
        int i24 = multiplyService0.multiply((-40840), (-319));
        int i27 = multiplyService0.multiply((-1077445373), (-840472364));
        int i30 = multiplyService0.multiply((-1004045259), 2069684240);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == (-382590128));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(559154859, (-4392));
        int i12 = sumService0.add((int) (byte) 10, 160575192);
        int i15 = sumService0.add(326142208, 142);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 559150467);
        org.junit.Assert.assertTrue(i12 == 160575202);
        org.junit.Assert.assertTrue(i15 == 326142350);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(915475213, (-1077463158));
        int i21 = sumService0.add(264818450, 1961448629);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == (-161987945));
        org.junit.Assert.assertTrue(i21 == (-2068700217));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(2370192, 386);
        int i24 = multiplyService0.multiply((-1), 1296581284);
        int i27 = multiplyService0.multiply((-828353057), (-7304));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == (-1296581284));
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(897633037, 377157165);
        int i15 = multiplyService0.multiply(18576, (-1330523392));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 217329481);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
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
        int i30 = multiplyService0.multiply(910407877, 1439723520);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == (-1296581284));
        org.junit.Assert.assertTrue(i27 == 14560000);
        org.junit.Assert.assertTrue(i30 == 702951424);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 516);
        int i15 = sumService0.add(1, 76440000);
        int i18 = sumService0.add((-4329), (int) (byte) 10);
        int i21 = sumService0.add((-540575988), (-828353057));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 548);
        org.junit.Assert.assertTrue(i15 == 76440001);
        org.junit.Assert.assertTrue(i18 == (-4319));
        org.junit.Assert.assertTrue(i21 == (-1368929045));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add((-71587808), (-579055083));
        int i21 = sumService0.add(1061202569, 0);
        int i24 = sumService0.add(1701800532, 561381094);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == (-650642891));
        org.junit.Assert.assertTrue(i21 == 1061202569);
        org.junit.Assert.assertTrue(i24 == (-2031785670));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((-90282413), (-1084340254));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == (-1174622667));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add(1382088704, (-2081677312));
        int i15 = sumService0.add(17785, 818780118);
        int i18 = sumService0.add(51454210, (-828353057));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == (-699588608));
        org.junit.Assert.assertTrue(i15 == 818797903);
        org.junit.Assert.assertTrue(i18 == (-776898847));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
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
        int i30 = multiplyService0.multiply(817256823, 289796093);
        int i33 = multiplyService0.multiply(0, (-668201433));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 1922224165);
        org.junit.Assert.assertTrue(i30 == 1708098459);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (byte) -1, 0);
        int i15 = multiplyService0.multiply(0, (int) ' ');
        int i18 = multiplyService0.multiply((-27034880), 2096518976);
        int i21 = multiplyService0.multiply(1794043904, 548);
        int i24 = multiplyService0.multiply((-2081677312), (-1247201587));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1716797440));
        org.junit.Assert.assertTrue(i21 == (-411451392));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 100, 914908945);
        int i15 = multiplyService0.multiply(101, (-1652043432));
        int i18 = multiplyService0.multiply(17760, 416);
        int i21 = multiplyService0.multiply(756005296, (int) (short) 1);
        int i24 = multiplyService0.multiply(1894292669, (-1830723464));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 7388160);
        org.junit.Assert.assertTrue(i21 == 756005296);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(2369842, (-319));
        int i21 = multiplyService0.multiply((-4207), 918681227);
        int i24 = multiplyService0.multiply((-1932158746), (-1404225171));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 578644411);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(18048, 1348052926);
        int i21 = multiplyService0.multiply((int) (byte) -1, 778560828);
        int i24 = multiplyService0.multiply((-210011484), (-258687196));
        int i27 = multiplyService0.multiply((-682811664), 819382871);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1330523392));
        org.junit.Assert.assertTrue(i21 == (-778560828));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-499194992));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 914894112);
        int i15 = sumService0.add(0, 818775962);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 914894245);
        org.junit.Assert.assertTrue(i15 == 818775962);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
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
        int i30 = multiplyService0.multiply(1419361151, (-1220810752));
        int i33 = multiplyService0.multiply((-40840), (-1669734140));
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
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(1300656750, 105372653);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 433981910);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 516);
        int i15 = sumService0.add(0, 1);
        int i18 = sumService0.add(1706919829, (-43733471));
        int i21 = sumService0.add(968434048, (-95502294));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 548);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i18 == 1663186358);
        org.junit.Assert.assertTrue(i21 == 872931754);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (short) 1, 10);
        int i12 = multiplyService0.multiply(2366108, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-1339282954), (int) ' ');
        int i15 = multiplyService0.multiply((-444431728), 904202840);
        int i18 = multiplyService0.multiply(377156815, 160575202);
        int i21 = multiplyService0.multiply(756009496, 756511759);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 92618432);
        org.junit.Assert.assertTrue(i15 == (-1731821184));
        org.junit.Assert.assertTrue(i18 == (-711503682));
        org.junit.Assert.assertTrue(i21 == 732411752);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 10, 0);
        int i15 = multiplyService0.multiply((-1243225992), 142);
        int i18 = multiplyService0.multiply(2443188, (-1847010432));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-444431728));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, 818776312);
        int i15 = multiplyService0.multiply(377150557, 214584351);
        int i18 = multiplyService0.multiply((-726304512), (-390266160));
        int i21 = multiplyService0.multiply(1863708879, 1997203108);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1873693507);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-2122432868));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
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
        int i30 = sumService0.add(1599313341, 93291856);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == (-1533480));
        org.junit.Assert.assertTrue(i30 == 1692605197);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(377139325, 11200);
        int i21 = sumService0.add(818775962, (-1077463158));
        int i24 = sumService0.add(867985636, 559141712);
        int i27 = sumService0.add((-1076732773), 20986);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 377150525);
        org.junit.Assert.assertTrue(i21 == (-258687196));
        org.junit.Assert.assertTrue(i24 == 1427127348);
        org.junit.Assert.assertTrue(i27 == (-1076711787));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((-349672704), (-661706111));
        int i18 = sumService0.add((-1898952389), (-586291745));
        int i21 = sumService0.add((-2081690441), (-1243225992));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == (-1011378815));
        org.junit.Assert.assertTrue(i18 == 1809723162);
        org.junit.Assert.assertTrue(i21 == 970050863);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((-1296581284), 133);
        int i15 = sumService0.add(21632, 818780118);
        int i18 = sumService0.add((-912620105), 134);
        int i21 = sumService0.add(160575192, (-250857605));
        int i24 = sumService0.add((-1815556555), 910407877);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1296581151));
        org.junit.Assert.assertTrue(i15 == 818801750);
        org.junit.Assert.assertTrue(i18 == (-912619971));
        org.junit.Assert.assertTrue(i21 == (-90282413));
        org.junit.Assert.assertTrue(i24 == (-905148678));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply(21632, (-13070257));
        int i12 = multiplyService0.multiply(1473882, 1457160878);
        int i15 = multiplyService0.multiply(882521996, 502029312);
        int i18 = multiplyService0.multiply((-828624347), 1296581294);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1972692780);
        org.junit.Assert.assertTrue(i15 == 2097565696);
        org.junit.Assert.assertTrue(i18 == (-293626074));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(818775862, (int) '#');
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 818775897);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(1292047509, 97);
        int i18 = multiplyService0.multiply(377138528, (-368954624));
        int i21 = multiplyService0.multiply(0, 1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 774556789);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply(700, 915475213);
        int i15 = multiplyService0.multiply(2369810, (-1827510048));
        int i18 = multiplyService0.multiply((-13070258), 893576728);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 882521996);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 420453200);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add(17760, 1759245869);
        int i21 = sumService0.add(1067316, 160575193);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == 1759263629);
        org.junit.Assert.assertTrue(i21 == 161642509);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 100, 914908945);
        int i15 = multiplyService0.multiply(101, (-1652043432));
        int i18 = multiplyService0.multiply(0, (int) (short) -1);
        int i21 = multiplyService0.multiply(31, 97);
        int i24 = multiplyService0.multiply(0, 0);
        int i27 = multiplyService0.multiply((-818780118), (-704669184));
        int i30 = multiplyService0.multiply(1174424602, (-364057955));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 3007);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 516);
        int i15 = sumService0.add(1, 76440000);
        int i18 = sumService0.add((-4329), (int) (byte) 10);
        int i21 = sumService0.add((-664942895), 18576);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 548);
        org.junit.Assert.assertTrue(i15 == 76440001);
        org.junit.Assert.assertTrue(i18 == (-4319));
        org.junit.Assert.assertTrue(i21 == (-664924319));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply(1419374298, (-128856819));
        int i6 = multiplyService0.multiply(1382089121, 1370048);
        int i9 = multiplyService0.multiply(914908955, 1825329580);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1909292992);
        org.junit.Assert.assertTrue(i9 == 1506332964);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
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
        int i30 = sumService0.add(47277568, 0);
        int i33 = sumService0.add((-1249303706), (-1679907612));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 14560032);
        org.junit.Assert.assertTrue(i18 == 373);
        org.junit.Assert.assertTrue(i21 == 774557175);
        org.junit.Assert.assertTrue(i24 == 377150557);
        org.junit.Assert.assertTrue(i27 == 1309520648);
        org.junit.Assert.assertTrue(i30 == 47277568);
        org.junit.Assert.assertTrue(i33 == 1365755978);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (-1199150660));
        int i12 = sumService0.add((-579055083), 893767818);
        int i15 = sumService0.add(42, 0);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == (-1199150659));
        org.junit.Assert.assertTrue(i12 == 314712735);
        org.junit.Assert.assertTrue(i15 == 42);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4392), 319);
        int i12 = sumService0.add(377157165, 3492);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4073));
        org.junit.Assert.assertTrue(i12 == 377160657);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(1351680, 915475213);
        int i12 = multiplyService0.multiply((-1459071872), (int) '#');
        int i15 = multiplyService0.multiply((-1368929045), 885292675);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-2081677312));
        org.junit.Assert.assertTrue(i12 == 472092032);
        org.junit.Assert.assertTrue(i15 == (-169507263));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(377139325, 11200);
        int i21 = sumService0.add((-1314386780), 1598341120);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 377150525);
        org.junit.Assert.assertTrue(i21 == 283954340);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 4200);
        int i15 = multiplyService0.multiply((-1127180196), (-31));
        int i18 = multiplyService0.multiply(1212483212, (-1706330015));
        int i21 = multiplyService0.multiply((-1776061271), 47277568);
        int i24 = multiplyService0.multiply(882521996, (-629524947));
        int i27 = multiplyService0.multiply((-13312), 371761505);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1334553088));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-1086829568));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add(132, (-1537067));
        int i18 = sumService0.add((-1296581151), (-1296585613));
        int i21 = sumService0.add(20064, 1500645299);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == (-1536935));
        org.junit.Assert.assertTrue(i18 == 1701800532);
        org.junit.Assert.assertTrue(i21 == 1500665363);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add(4200, 1470000);
        int i18 = sumService0.add(377139325, 11200);
        int i21 = sumService0.add(1328957751, (-72237792));
        int i24 = sumService0.add(101, 1829254332);
        int i27 = sumService0.add(165, 755727000);
        int i30 = sumService0.add((int) '4', 1334161400);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == 1474200);
        org.junit.Assert.assertTrue(i18 == 377150525);
        org.junit.Assert.assertTrue(i21 == 1256719959);
        org.junit.Assert.assertTrue(i24 == 1829254433);
        org.junit.Assert.assertTrue(i27 == 755727165);
        org.junit.Assert.assertTrue(i30 == 1334161452);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(379527007, (-13312));
        int i21 = multiplyService0.multiply(595110372, (-1639689807));
        int i24 = multiplyService0.multiply(1670738110, (-1539741705));
        int i27 = multiplyService0.multiply((-668201433), (-1612709888));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(18048, 1348052926);
        int i21 = multiplyService0.multiply(914908945, 197745416);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1330523392));
        org.junit.Assert.assertTrue(i21 == (-666942584));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply((-1912725504), (-726304512));
        int i21 = multiplyService0.multiply((-86179849), 234);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1308751814);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(3209, (int) (byte) 1);
        int i15 = multiplyService0.multiply((-1076953436), 559150467);
        int i18 = multiplyService0.multiply((-484168746), 318069680);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == (-204783124));
        org.junit.Assert.assertTrue(i18 == 71382304);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(133, (int) (short) 1);
        int i18 = sumService0.add(0, (-713157760));
        int i21 = sumService0.add(1452940604, (-2068700217));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 134);
        org.junit.Assert.assertTrue(i18 == (-713157760));
        org.junit.Assert.assertTrue(i21 == (-615759613));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(292600, 289796093);
        int i15 = sumService0.add(1350216625, 1779394550);
        int i18 = sumService0.add((-121861064), 0);
        int i21 = sumService0.add((-1011378815), 502029631);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 290088693);
        org.junit.Assert.assertTrue(i15 == (-1165356121));
        org.junit.Assert.assertTrue(i18 == (-121861064));
        org.junit.Assert.assertTrue(i21 == (-509349184));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(100, 914894245);
        int i21 = sumService0.add(31, (-4392));
        int i24 = sumService0.add(1705840296, (-1912725504));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 914894345);
        org.junit.Assert.assertTrue(i21 == (-4361));
        org.junit.Assert.assertTrue(i24 == (-206885208));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add(17760, 1759245869);
        int i21 = sumService0.add(712023936, 377138725);
        int i24 = sumService0.add(1500649660, (-2079704743));
        int i27 = sumService0.add((-1062015850), (-1546294936));
        int i30 = sumService0.add(2049805233, 562888622);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == 1759263629);
        org.junit.Assert.assertTrue(i21 == 1089162661);
        org.junit.Assert.assertTrue(i24 == (-579055083));
        org.junit.Assert.assertTrue(i27 == 1686656510);
        org.junit.Assert.assertTrue(i30 == (-1682273441));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(0, 1352000);
        int i21 = multiplyService0.multiply(1259679106, (-265));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 10, 0);
        int i15 = multiplyService0.multiply((-682497744), (-1373994118));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(1, (int) (short) 10);
        int i15 = multiplyService0.multiply(236995050, 700);
        int i18 = multiplyService0.multiply(1382088704, 51468007);
        int i21 = multiplyService0.multiply(2006712320, 259198331);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == (-1607189544));
        org.junit.Assert.assertTrue(i18 == (-343474176));
        org.junit.Assert.assertTrue(i21 == 1676935168);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply((-32), (-13147));
        int i18 = multiplyService0.multiply(0, 161642509);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply(236990600, 51449979);
        int i21 = multiplyService0.multiply((-579055083), 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == (-1652043432));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply(3200, 0);
        int i21 = multiplyService0.multiply(241426646, (-1417829059));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(1, (int) (short) 10);
        int i15 = multiplyService0.multiply(236995050, 700);
        int i18 = multiplyService0.multiply(1382088704, 51468007);
        int i21 = multiplyService0.multiply(559166058, 1155571369);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == (-1607189544));
        org.junit.Assert.assertTrue(i18 == (-343474176));
        org.junit.Assert.assertTrue(i21 == 1014150138);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add(51449979, 160575192);
        int i21 = sumService0.add(0, 1473882);
        int i24 = sumService0.add(610625987, 392370668);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == 212025171);
        org.junit.Assert.assertTrue(i21 == 1473882);
        org.junit.Assert.assertTrue(i24 == 1002996655);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(700, 386);
        int i18 = sumService0.add((-1975096195), 217329481);
        int i21 = sumService0.add(1166302803, (-708836419));
        int i24 = sumService0.add((-1498897379), 1028152501);
        int i27 = sumService0.add(137053098, 1651700948);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1086);
        org.junit.Assert.assertTrue(i18 == (-1757766714));
        org.junit.Assert.assertTrue(i21 == 457466384);
        org.junit.Assert.assertTrue(i24 == (-470744878));
        org.junit.Assert.assertTrue(i27 == 1788754046);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(897633037, 17842176);
        int i15 = sumService0.add(319, 559172619);
        int i18 = sumService0.add(0, (-1088093480));
        int i21 = sumService0.add(1352000, 155534506);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 915475213);
        org.junit.Assert.assertTrue(i15 == 559172938);
        org.junit.Assert.assertTrue(i18 == (-1088093480));
        org.junit.Assert.assertTrue(i21 == 156886506);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add((-223168260), (-451133912));
        int i24 = sumService0.add((-1827514450), 0);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == (-674302172));
        org.junit.Assert.assertTrue(i24 == (-1827514450));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add(133, 14700);
        int i21 = sumService0.add((-121861064), 363756358);
        int i24 = sumService0.add(1296581284, (-1413152768));
        int i27 = sumService0.add(738560980, (-509349184));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 14833);
        org.junit.Assert.assertTrue(i21 == 241895294);
        org.junit.Assert.assertTrue(i24 == (-116571484));
        org.junit.Assert.assertTrue(i27 == 229211796);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add((-1076711787), 1439723520);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 363011733);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(67247920, 818775862);
        int i18 = sumService0.add(350, 290088693);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == 886023782);
        org.junit.Assert.assertTrue(i18 == 290089043);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(4224, 320);
        int i12 = multiplyService0.multiply(420000, 5660160);
        int i15 = multiplyService0.multiply((-210011484), 7388160);
        int i18 = multiplyService0.multiply(47277568, 14560032);
        int i21 = multiplyService0.multiply((-2144681984), 9);
        int i24 = multiplyService0.multiply((-1296570913), 1304885932);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 1351680);
        org.junit.Assert.assertTrue(i12 == (-2144681984));
        org.junit.Assert.assertTrue(i15 == 1439723520);
        org.junit.Assert.assertTrue(i18 == (-95502336));
        org.junit.Assert.assertTrue(i21 == (-2122268672));
        org.junit.Assert.assertTrue(i24 == (-2021378092));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add((-1116914032), (int) (short) 1);
        int i15 = sumService0.add(1470000, 7791000);
        int i18 = sumService0.add((-1577640920), 0);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == (-1116914031));
        org.junit.Assert.assertTrue(i15 == 9261000);
        org.junit.Assert.assertTrue(i18 == (-1577640920));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add(17760, 1759245869);
        int i21 = sumService0.add(712023936, 377138725);
        int i24 = sumService0.add(1500649660, (-2079704743));
        int i27 = sumService0.add((-1062015850), (-1546294936));
        int i30 = sumService0.add((-19208), (-411451392));
        int i33 = sumService0.add(9, (-777639176));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == 1759263629);
        org.junit.Assert.assertTrue(i21 == 1089162661);
        org.junit.Assert.assertTrue(i24 == (-579055083));
        org.junit.Assert.assertTrue(i27 == 1686656510);
        org.junit.Assert.assertTrue(i30 == (-411470600));
        org.junit.Assert.assertTrue(i33 == (-777639167));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add(1382088704, (-2081677312));
        int i15 = sumService0.add(17785, 818780118);
        int i18 = sumService0.add((-1084340254), 1598341120);
        int i21 = sumService0.add((-104030208), (-499194992));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == (-699588608));
        org.junit.Assert.assertTrue(i15 == 818797903);
        org.junit.Assert.assertTrue(i18 == 514000866);
        org.junit.Assert.assertTrue(i21 == (-603225200));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) '4', 1);
        int i12 = sumService0.add((-1296581151), 375605048);
        int i15 = sumService0.add(292600, 1166302803);
        int i18 = sumService0.add((-407555187), 152);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 53);
        org.junit.Assert.assertTrue(i12 == (-920976103));
        org.junit.Assert.assertTrue(i15 == 1166595403);
        org.junit.Assert.assertTrue(i18 == (-407555035));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((-1461873152), 2123366400);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1610612736);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply((int) (byte) 0, 1474200);
        int i21 = multiplyService0.multiply(9, (-13281));
        int i24 = multiplyService0.multiply(1500648960, 920032939);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == (-65490432));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (short) 1, 10);
        int i12 = multiplyService0.multiply(0, (-737134487));
        int i15 = multiplyService0.multiply((-1617040168), 35515);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-1173851704));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-4207), 2370192);
        int i12 = multiplyService0.multiply((-1077467365), 379527007);
        int i15 = multiplyService0.multiply(51468007, 1839793749);
        int i18 = multiplyService0.multiply((-2083597203), 1706919829);
        int i21 = multiplyService0.multiply(457171164, 1920687098);
        int i24 = multiplyService0.multiply((-1827514450), (int) (short) 1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1381463152));
        org.junit.Assert.assertTrue(i12 == (-462895099));
        org.junit.Assert.assertTrue(i15 == 642401459);
        org.junit.Assert.assertTrue(i18 == (-1629479311));
        org.junit.Assert.assertTrue(i21 == 1392757464);
        org.junit.Assert.assertTrue(i24 == (-1827514450));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, 818776312);
        int i15 = multiplyService0.multiply(377150557, 214584351);
        int i18 = multiplyService0.multiply(0, (-1077152773));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 1873693507);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add((-32), 42);
        int i21 = sumService0.add((-1077445373), (-1536935));
        int i24 = sumService0.add((-1420919549), 1774052808);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertTrue(i21 == (-1078982308));
        org.junit.Assert.assertTrue(i24 == 353133259);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(350, 42);
        int i12 = multiplyService0.multiply(749034, 100);
        int i15 = multiplyService0.multiply((-4207), (-1008953315));
        int i18 = multiplyService0.multiply(1382089355, (-1896386558));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 14700);
        org.junit.Assert.assertTrue(i12 == 74903400);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) 'a', 1382089355);
        int i12 = multiplyService0.multiply((-787016052), (-13129));
        int i15 = multiplyService0.multiply((-32), 1894250516);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 918681259);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-486474368));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(164752000, 14546853);
        int i12 = multiplyService0.multiply(1292047509, 893767666);
        int i15 = multiplyService0.multiply(363774046, 391167901);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 1309516928);
        org.junit.Assert.assertTrue(i12 == (-1346965542));
        org.junit.Assert.assertTrue(i15 == 1024596902);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(51449979, (-1827514450));
        int i9 = sumService0.add(2425500, 918681259);
        int i12 = sumService0.add(17416192, 940373074);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == (-1776064471));
        org.junit.Assert.assertTrue(i9 == 921106759);
        org.junit.Assert.assertTrue(i12 == 957789266);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(0, 1598341120);
        int i15 = multiplyService0.multiply(53, 1);
        int i18 = multiplyService0.multiply(377157165, 1296581294);
        int i21 = multiplyService0.multiply(1382089355, (-318));
        int i24 = multiplyService0.multiply(1906196480, 1125541544);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 53);
        org.junit.Assert.assertTrue(i18 == (-1062015850));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 492437504);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(292600, 289796093);
        int i15 = sumService0.add(1350216625, 1779394550);
        int i18 = sumService0.add((-932667840), 1372804491);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 290088693);
        org.junit.Assert.assertTrue(i15 == (-1165356121));
        org.junit.Assert.assertTrue(i18 == 440136651);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(0, 3201);
        int i21 = sumService0.add(194, 236990600);
        int i24 = sumService0.add(1, 320);
        int i27 = sumService0.add(0, 76440000);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 3201);
        org.junit.Assert.assertTrue(i21 == 236990794);
        org.junit.Assert.assertTrue(i24 == 321);
        org.junit.Assert.assertTrue(i27 == 76440000);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((-912619971), 17688);
        int i15 = multiplyService0.multiply((-210011164), (int) (short) 0);
        int i18 = multiplyService0.multiply((-1189609472), (-10908642));
        int i21 = multiplyService0.multiply((-1319191084), 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == (-1934948680));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add((int) (byte) 1, 14700);
        int i18 = sumService0.add((-1669734140), 1809723162);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 14701);
        org.junit.Assert.assertTrue(i18 == 139989022);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(1, (int) (short) 10);
        int i15 = multiplyService0.multiply(236995050, 700);
        int i18 = multiplyService0.multiply((-1392072616), (-1075080271));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == (-1607189544));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(416, 1382088705);
        int i18 = sumService0.add((-953541068), 17688);
        int i21 = sumService0.add(1599313021, 320);
        int i24 = sumService0.add(391167901, (-1994915840));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 1382089121);
        org.junit.Assert.assertTrue(i18 == (-953523380));
        org.junit.Assert.assertTrue(i21 == 1599313341);
        org.junit.Assert.assertTrue(i24 == (-1603747939));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(3209, 319);
        int i9 = sumService0.add(35515, (-778570983));
        int i12 = sumService0.add((-123231112), (-1652866106));
        int i15 = sumService0.add((-1798394867), (-190823920));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 3528);
        org.junit.Assert.assertTrue(i9 == (-778535468));
        org.junit.Assert.assertTrue(i12 == (-1776097218));
        org.junit.Assert.assertTrue(i15 == (-1989218787));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(319, 97);
        int i18 = sumService0.add(377156815, 350);
        int i21 = sumService0.add(51450010, (-4339));
        int i24 = sumService0.add((-1888865072), 1955233);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 416);
        org.junit.Assert.assertTrue(i18 == 377157165);
        org.junit.Assert.assertTrue(i21 == 51445671);
        org.junit.Assert.assertTrue(i24 == (-1886909839));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 100, 914908945);
        int i15 = multiplyService0.multiply(101, (-1652043432));
        int i18 = multiplyService0.multiply(17760, 416);
        int i21 = multiplyService0.multiply(914894245, 914894112);
        int i24 = multiplyService0.multiply(1305542656, (int) '4');
        int i27 = multiplyService0.multiply(133, (-827083360));
        int i30 = multiplyService0.multiply(1419374298, 160575192);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 7388160);
        org.junit.Assert.assertTrue(i21 == (-827083360));
        org.junit.Assert.assertTrue(i24 == (-831258624));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == (-316623888));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add(236990794, 4256);
        int i21 = sumService0.add(51445671, 51467735);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 236995050);
        org.junit.Assert.assertTrue(i21 == 102913406);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply(249110840, 14560000);
        int i15 = multiplyService0.multiply(275679888, 214584351);
        int i18 = multiplyService0.multiply(391266728, 548);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 1193568256);
        org.junit.Assert.assertTrue(i15 == (-467302544));
        org.junit.Assert.assertTrue(i18 == (-334197856));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
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
        int i30 = sumService0.add((-626325562), 914895169);
        int i33 = sumService0.add(1185712187, 102913406);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1386193495);
        org.junit.Assert.assertTrue(i27 == (-1827514450));
        org.junit.Assert.assertTrue(i30 == 288569607);
        org.junit.Assert.assertTrue(i33 == 1288625593);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) '#', 97);
        int i12 = sumService0.add(3200, 9);
        int i15 = sumService0.add(1797416241, (-318));
        int i18 = sumService0.add((-1296581151), (-1880319512));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 132);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 1797415923);
        org.junit.Assert.assertTrue(i18 == 1118066633);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(319, 97);
        int i18 = sumService0.add(377156815, 2370192);
        int i21 = sumService0.add((-1652043432), 914908945);
        int i24 = sumService0.add(193, 39562);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 416);
        org.junit.Assert.assertTrue(i18 == 379527007);
        org.junit.Assert.assertTrue(i21 == (-737134487));
        org.junit.Assert.assertTrue(i24 == 39755);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply(1166595403, 0);
        int i6 = multiplyService0.multiply((-128856819), (-2136905344));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(897633037, 17842176);
        int i15 = sumService0.add((-1827514450), 914894345);
        int i18 = sumService0.add(3243, 1309520648);
        int i21 = sumService0.add((-905148678), 653328384);
        int i24 = sumService0.add((-2068700217), 1704143264);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 915475213);
        org.junit.Assert.assertTrue(i15 == (-912620105));
        org.junit.Assert.assertTrue(i18 == 1309523891);
        org.junit.Assert.assertTrue(i21 == (-251820294));
        org.junit.Assert.assertTrue(i24 == (-364556953));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(1759263629, 2049805233);
        int i18 = sumService0.add(738560980, 386);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == (-485898434));
        org.junit.Assert.assertTrue(i18 == 738561366);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(0, 2369906);
        int i18 = sumService0.add(0, 3201);
        int i21 = sumService0.add(194, 236990600);
        int i24 = sumService0.add((-1827514450), 968434048);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 2369906);
        org.junit.Assert.assertTrue(i18 == 3201);
        org.junit.Assert.assertTrue(i21 == 236990794);
        org.junit.Assert.assertTrue(i24 == (-859080402));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) (short) 0, 914908945);
        int i6 = multiplyService0.multiply(2369874, 14559776);
        int i9 = multiplyService0.multiply((-1078982308), 653328384);
        int i12 = multiplyService0.multiply((-2367493), 2369874);
        int i15 = multiplyService0.multiply(0, (-828353057));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == (-932667840));
        org.junit.Assert.assertTrue(i9 == 2006712320);
        org.junit.Assert.assertTrue(i12 == (-1432817306));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(700, 386);
        int i18 = sumService0.add((-1975096195), 217329481);
        int i21 = sumService0.add(0, (-482980236));
        int i24 = sumService0.add(559175526, 51450461);
        int i27 = sumService0.add((-659562004), 2013398917);
        int i30 = sumService0.add((-1), (-357747079));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1086);
        org.junit.Assert.assertTrue(i18 == (-1757766714));
        org.junit.Assert.assertTrue(i21 == (-482980236));
        org.junit.Assert.assertTrue(i24 == 610625987);
        org.junit.Assert.assertTrue(i27 == 1353836913);
        org.junit.Assert.assertTrue(i30 == (-357747080));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 516);
        int i15 = sumService0.add((-704669184), 0);
        int i18 = sumService0.add((-161987945), 1894292752);
        int i21 = sumService0.add(115400158, (-444431728));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 548);
        org.junit.Assert.assertTrue(i15 == (-704669184));
        org.junit.Assert.assertTrue(i18 == 1732304807);
        org.junit.Assert.assertTrue(i21 == (-329031570));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '4', 416);
        int i9 = multiplyService0.multiply(914894112, (int) (byte) -1);
        int i12 = multiplyService0.multiply((-3908), 249110840);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 21632);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1432413472);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(42, 76440001);
        int i21 = multiplyService0.multiply(51454210, 918681259);
        int i24 = multiplyService0.multiply((-325954674), (-1077445373));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1084487254));
        org.junit.Assert.assertTrue(i21 == (-794101674));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 100, 914908945);
        int i15 = multiplyService0.multiply(101, (-1652043432));
        int i18 = multiplyService0.multiply(0, (int) (short) -1);
        int i21 = multiplyService0.multiply(920032939, 2030466222);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-584981446));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(0, 234);
        int i12 = multiplyService0.multiply(17760, 1761760944);
        int i15 = multiplyService0.multiply((-1243225992), 160596188);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 37614080);
        org.junit.Assert.assertTrue(i15 == 2117658400);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', (-1827510048));
        int i6 = multiplyService0.multiply((-912620104), 325338392);
        int i9 = multiplyService0.multiply((-1533678451), 79044516);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 1885806912);
        org.junit.Assert.assertTrue(i9 == (-135357100));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((-32), 350);
        int i9 = sumService0.add((int) (short) -1, (int) (byte) 10);
        int i12 = sumService0.add((-726304512), (-1652043432));
        int i15 = sumService0.add((-681746432), 2443188);
        int i18 = sumService0.add((-1346170880), (-1003018402));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 318);
        org.junit.Assert.assertTrue(i9 == 9);
        org.junit.Assert.assertTrue(i12 == 1916619352);
        org.junit.Assert.assertTrue(i15 == (-679303244));
        org.junit.Assert.assertTrue(i18 == 1945778014);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
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
        int i30 = sumService0.add((-1334553088), 1829254332);
        int i33 = sumService0.add(51445671, 17821);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == (-818765408));
        org.junit.Assert.assertTrue(i30 == 494701244);
        org.junit.Assert.assertTrue(i33 == 51463492);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-4207), 2370192);
        int i12 = multiplyService0.multiply((-1077467365), 379527007);
        int i15 = multiplyService0.multiply(51468007, 818775962);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1381463152));
        org.junit.Assert.assertTrue(i12 == (-462895099));
        org.junit.Assert.assertTrue(i15 == (-465758218));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(1829254433, (-579055083));
        int i15 = sumService0.add(214584351, (-926097396));
        int i18 = sumService0.add((-777639167), (-1939001288));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 1250199350);
        org.junit.Assert.assertTrue(i15 == (-711513045));
        org.junit.Assert.assertTrue(i18 == 1578326841);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(2370192, 386);
        int i24 = multiplyService0.multiply((-1), 1296581284);
        int i27 = multiplyService0.multiply(17842176, 42);
        int i30 = multiplyService0.multiply(1311579965, (int) (byte) 10);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 914894112);
        org.junit.Assert.assertTrue(i24 == (-1296581284));
        org.junit.Assert.assertTrue(i27 == 749371392);
        org.junit.Assert.assertTrue(i30 == 230897762);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply(0, 1328957751);
        int i30 = multiplyService0.multiply(653328384, 1467056384);
        int i33 = multiplyService0.multiply(1292047473, 79044516);
        int i36 = multiplyService0.multiply(713463808, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 1895825408);
        org.junit.Assert.assertTrue(i33 == 29935460);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add(1382088704, (-2081677312));
        int i15 = sumService0.add(18190, (int) (byte) 0);
        int i18 = sumService0.add((-4391), (-2081690441));
        int i21 = sumService0.add((-778535468), 1089162661);
        int i24 = sumService0.add((-1129784712), 1185712187);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == (-699588608));
        org.junit.Assert.assertTrue(i15 == 18190);
        org.junit.Assert.assertTrue(i18 == (-2081694832));
        org.junit.Assert.assertTrue(i21 == 310627193);
        org.junit.Assert.assertTrue(i24 == 55927475);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply(502029312, (-1296578083));
        int i24 = multiplyService0.multiply(0, (-4073));
        int i27 = multiplyService0.multiply((-4402), 1125541544);
        int i30 = multiplyService0.multiply(0, 217329674);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 1758382896);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((-912619971), 17688);
        int i15 = multiplyService0.multiply((-210011164), (int) (short) 0);
        int i18 = multiplyService0.multiply(1309516928, (-478267292));
        int i21 = multiplyService0.multiply(818771572, (-6774564));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == (-1934948680));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
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
        int i33 = multiplyService0.multiply(42, 0);
        int i36 = multiplyService0.multiply(14560041, (-953556088));
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
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply(236990600, 51449979);
        int i21 = multiplyService0.multiply(1080336032, (-681746432));
        int i24 = multiplyService0.multiply(392370668, 239438238);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == (-1652043432));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 1554336680);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(559154859, 17760);
        int i27 = sumService0.add(2035113012, 2369842);
        int i30 = sumService0.add(131, (-1706330015));
        int i33 = sumService0.add(1080336032, 1319705344);
        int i36 = sumService0.add(521082377, 1909292992);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 559172619);
        org.junit.Assert.assertTrue(i27 == 2037482854);
        org.junit.Assert.assertTrue(i30 == (-1706329884));
        org.junit.Assert.assertTrue(i33 == (-1894925920));
        org.junit.Assert.assertTrue(i36 == (-1864591927));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (int) (short) 100);
        int i12 = sumService0.add(1382088704, (-2081677312));
        int i15 = sumService0.add(18190, (int) (byte) 0);
        int i18 = sumService0.add((-4391), (-2081690441));
        int i21 = sumService0.add((-1004045259), (-4402));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 101);
        org.junit.Assert.assertTrue(i12 == (-699588608));
        org.junit.Assert.assertTrue(i15 == 18190);
        org.junit.Assert.assertTrue(i18 == (-2081694832));
        org.junit.Assert.assertTrue(i21 == (-1004049661));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((-32), 350);
        int i9 = sumService0.add((int) (short) -1, (int) (byte) 10);
        int i12 = sumService0.add(134, (-13281));
        int i15 = sumService0.add((-4392), 53);
        int i18 = sumService0.add(1506332964, 603236480);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 318);
        org.junit.Assert.assertTrue(i9 == 9);
        org.junit.Assert.assertTrue(i12 == (-13147));
        org.junit.Assert.assertTrue(i15 == (-4339));
        org.junit.Assert.assertTrue(i18 == 2109569444);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((-318), 2370192);
        int i18 = sumService0.add(133, 14700);
        int i21 = sumService0.add((-121861064), 363756358);
        int i24 = sumService0.add((-1176980632), 180900992);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 2369874);
        org.junit.Assert.assertTrue(i18 == 14833);
        org.junit.Assert.assertTrue(i21 == 241895294);
        org.junit.Assert.assertTrue(i24 == (-996079640));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(292600, 289796093);
        int i15 = sumService0.add(1350216625, 1779394550);
        int i18 = sumService0.add((-121861064), 0);
        int i21 = sumService0.add((-364057955), (int) '4');
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 290088693);
        org.junit.Assert.assertTrue(i15 == (-1165356121));
        org.junit.Assert.assertTrue(i18 == (-121861064));
        org.junit.Assert.assertTrue(i21 == (-364057903));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply(0, 1372804491);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply((-318), 0);
        int i30 = multiplyService0.multiply(3755, (-1896386558));
        int i33 = multiplyService0.multiply(391266728, (-318));
        int i36 = multiplyService0.multiply(0, 11904);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(147000, 0);
        int i12 = sumService0.add(21632, 51450010);
        int i15 = sumService0.add(1256700751, 7791000);
        int i18 = sumService0.add((-190823920), (-932667840));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 51471642);
        org.junit.Assert.assertTrue(i15 == 1264491751);
        org.junit.Assert.assertTrue(i18 == (-1123491760));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply((-32), 416);
        int i24 = multiplyService0.multiply(0, 559154881);
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(319, 97);
        int i18 = sumService0.add(377156815, 2370192);
        int i21 = sumService0.add(1588922788, 1166302803);
        int i24 = sumService0.add(2069684240, (-1084340254));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 416);
        org.junit.Assert.assertTrue(i18 == 379527007);
        org.junit.Assert.assertTrue(i21 == (-1539741705));
        org.junit.Assert.assertTrue(i24 == 985343986);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(4200, (int) (byte) 0);
        int i18 = multiplyService0.multiply((-6778883), 236990600);
        int i21 = multiplyService0.multiply((-1335626144), (-349672704));
        int i24 = multiplyService0.multiply((-1541019), (-1383407610));
        int i27 = multiplyService0.multiply(0, 1328961975);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 967569000);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(897633037, 17842176);
        int i15 = sumService0.add(559154858, 20986);
        int i18 = sumService0.add(14560183, 11937480);
        int i21 = sumService0.add(1370048, (-123231112));
        int i24 = sumService0.add(2026602496, (-1424625664));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == 915475213);
        org.junit.Assert.assertTrue(i15 == 559175844);
        org.junit.Assert.assertTrue(i18 == 26497663);
        org.junit.Assert.assertTrue(i21 == (-121861064));
        org.junit.Assert.assertTrue(i24 == 601976832);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
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
        int i30 = sumService0.add(145600, (-1335626144));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1386193495);
        org.junit.Assert.assertTrue(i27 == (-1827514450));
        org.junit.Assert.assertTrue(i30 == (-1335480544));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply(0, 234);
        int i12 = multiplyService0.multiply(17760, 1761760944);
        int i15 = multiplyService0.multiply(1266571157, 0);
        int i18 = multiplyService0.multiply(985343986, (-1076953436));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 37614080);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply(3200, 0);
        int i21 = multiplyService0.multiply(296570614, 700);
        int i24 = multiplyService0.multiply(1250199350, (-861118659));
        int i27 = multiplyService0.multiply((-1532688908), 377160384);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1440999592);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-1710465280));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(0, 1352000);
        int i21 = multiplyService0.multiply(97, 36);
        int i24 = multiplyService0.multiply(198420678, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 3492);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(1230234744, 320);
        int i21 = multiplyService0.multiply((-407555187), 810547712);
        int i24 = multiplyService0.multiply(791235472, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1461873152));
        org.junit.Assert.assertTrue(i21 == 1289400832);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add(51450011, 502029312);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 553479323);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(2370192, (-4319));
        int i12 = sumService0.add((-1220732288), 897151680);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 2365873);
        org.junit.Assert.assertTrue(i12 == (-323580608));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply((-318), 882521996);
        int i21 = multiplyService0.multiply(14710, (-1339282954));
        int i24 = multiplyService0.multiply(2604516, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == (-1469120488));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(1, (-32));
        int i9 = sumService0.add(160579584, (-4392));
        int i12 = sumService0.add(31, 100);
        int i15 = sumService0.add(51450011, 1309517028);
        int i18 = sumService0.add(1956552024, 818776312);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-31));
        org.junit.Assert.assertTrue(i9 == 160575192);
        org.junit.Assert.assertTrue(i12 == 131);
        org.junit.Assert.assertTrue(i15 == 1360967039);
        org.junit.Assert.assertTrue(i18 == (-1519638960));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply(21632, (-13070257));
        int i12 = multiplyService0.multiply((-661706111), 160596188);
        int i15 = multiplyService0.multiply(373424552, 1473882);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1994065628);
        org.junit.Assert.assertTrue(i15 == 846437648);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply(9, 17842176);
        int i15 = multiplyService0.multiply(559175844, 14700);
        int i18 = multiplyService0.multiply((-1084340254), 1920676996);
        int i21 = multiplyService0.multiply(39755, (-13312));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 160579584);
        org.junit.Assert.assertTrue(i15 == (-682497744));
        org.junit.Assert.assertTrue(i18 == 13432968);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply((-4084), 1620577792);
        int i24 = multiplyService0.multiply(1166302803, (-1392072616));
        int i27 = multiplyService0.multiply((-409531649), (-1296585613));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == 104900608);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((-1296581284), (-678514911));
        int i9 = sumService0.add(3201, 17785);
        int i12 = sumService0.add((-1827514450), (-1947786240));
        int i15 = sumService0.add((-912620105), (-2081690441));
        int i18 = sumService0.add(914894245, 1128);
        int i21 = sumService0.add((-1829598491), 249110840);
        int i24 = sumService0.add(648376867, (-42144956));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-1975096195));
        org.junit.Assert.assertTrue(i9 == 20986);
        org.junit.Assert.assertTrue(i12 == 519666606);
        org.junit.Assert.assertTrue(i15 == 1300656750);
        org.junit.Assert.assertTrue(i18 == 914895373);
        org.junit.Assert.assertTrue(i21 == (-1580487651));
        org.junit.Assert.assertTrue(i24 == 606231911);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(2370192, (-4319));
        int i12 = sumService0.add(1452940604, 1174424602);
        int i15 = sumService0.add((-1679585984), (-1088093480));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 2365873);
        org.junit.Assert.assertTrue(i12 == (-1667602090));
        org.junit.Assert.assertTrue(i15 == 1527287832);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((int) ' ', 14560000);
        int i18 = sumService0.add(372, (int) (short) 1);
        int i21 = sumService0.add((-6778883), 372678416);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 14560032);
        org.junit.Assert.assertTrue(i18 == 373);
        org.junit.Assert.assertTrue(i21 == 365899533);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(1230234744, 320);
        int i21 = multiplyService0.multiply(578490368, 1128);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1461873152));
        org.junit.Assert.assertTrue(i21 == (-297893888));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(133, (-1537200));
        int i15 = sumService0.add(1474200, (-318));
        int i18 = sumService0.add(1335631400, 1620577792);
        int i21 = sumService0.add(818780118, (-1523295));
        int i24 = sumService0.add((-1747884032), 51450319);
        int i27 = sumService0.add(839999608, 0);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == (-1537067));
        org.junit.Assert.assertTrue(i15 == 1473882);
        org.junit.Assert.assertTrue(i18 == (-1338758104));
        org.junit.Assert.assertTrue(i21 == 817256823);
        org.junit.Assert.assertTrue(i24 == (-1696433713));
        org.junit.Assert.assertTrue(i27 == 839999608);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(14546853, 559154859);
        int i18 = multiplyService0.multiply((-128856819), (-1947786240));
        int i21 = multiplyService0.multiply(132, (-1994915840));
        int i24 = multiplyService0.multiply((-1577640920), (-2081690441));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1328957751);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-4207), 2370192);
        int i12 = multiplyService0.multiply(3200, 377138625);
        int i15 = multiplyService0.multiply(160579584, (-777639176));
        int i18 = multiplyService0.multiply((-713157760), (-1871938824));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1381463152));
        org.junit.Assert.assertTrue(i12 == (-42210176));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((-319), 14560000);
        int i15 = multiplyService0.multiply((-1965151091), 2096518976);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == (-349672704));
        org.junit.Assert.assertTrue(i15 == 1412238912);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, 914908945);
        int i15 = multiplyService0.multiply(1365755978, 1848852940);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 559154858);
        org.junit.Assert.assertTrue(i15 == (-347314952));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(1, (-32));
        int i9 = sumService0.add(160579584, (-4392));
        int i12 = sumService0.add(31, 100);
        int i15 = sumService0.add(279389682, 1412434774);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == (-31));
        org.junit.Assert.assertTrue(i9 == 160575192);
        org.junit.Assert.assertTrue(i12 == 131);
        org.junit.Assert.assertTrue(i15 == 1691824456);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(3209, 319);
        int i9 = sumService0.add(35515, (-778570983));
        int i12 = sumService0.add((-1296581151), 1961448629);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 3528);
        org.junit.Assert.assertTrue(i9 == (-778535468));
        org.junit.Assert.assertTrue(i12 == 664867478);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-13312), 31);
        int i24 = sumService0.add(214584351, 1309517028);
        int i27 = sumService0.add(0, (-1652866106));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-13281));
        org.junit.Assert.assertTrue(i24 == 1524101379);
        org.junit.Assert.assertTrue(i27 == (-1652866106));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(132, 134);
        int i18 = multiplyService0.multiply(164752000, 51450000);
        int i21 = multiplyService0.multiply(3209, 3720);
        int i24 = multiplyService0.multiply(0, (-1373648896));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 17688);
        org.junit.Assert.assertTrue(i18 == (-1220810752));
        org.junit.Assert.assertTrue(i21 == 11937480);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add((int) (byte) 10, 266);
        int i15 = sumService0.add((int) (short) 1, 3200);
        int i18 = sumService0.add((-1541019), 17724);
        int i21 = sumService0.add((-4084), (-4390));
        int i24 = sumService0.add(0, (-13147));
        int i27 = sumService0.add(102913406, 0);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 276);
        org.junit.Assert.assertTrue(i15 == 3201);
        org.junit.Assert.assertTrue(i18 == (-1523295));
        org.junit.Assert.assertTrue(i21 == (-8474));
        org.junit.Assert.assertTrue(i24 == (-13147));
        org.junit.Assert.assertTrue(i27 == 102913406);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add((int) (byte) 10, 266);
        int i15 = sumService0.add(2369842, (-1498897379));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 276);
        org.junit.Assert.assertTrue(i15 == (-1496527537));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 4200);
        int i15 = multiplyService0.multiply((-1127180196), (-31));
        int i18 = multiplyService0.multiply(2046336526, 774556789);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 1323263078);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((-4084), (int) (short) 10);
        int i15 = multiplyService0.multiply((-32), 0);
        int i18 = multiplyService0.multiply(42, 76440001);
        int i21 = multiplyService0.multiply(51454210, 918681259);
        int i24 = multiplyService0.multiply(967569000, 1883825454);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == (-40840));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1084487254));
        org.junit.Assert.assertTrue(i21 == (-794101674));
        org.junit.Assert.assertTrue(i24 == (-1234706768));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(379527007, (-13312));
        int i21 = multiplyService0.multiply(214584351, 559141712);
        int i24 = multiplyService0.multiply(261704448, (-1116914032));
        int i27 = multiplyService0.multiply(818801750, (-7245632));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1761760944);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply(1296581284, (int) (short) 1);
        int i15 = multiplyService0.multiply(502029312, (-1481422540));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add((-1048949220), 10);
        int i12 = sumService0.add((-1714864128), (-818780118));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == (-1048949210));
        org.junit.Assert.assertTrue(i12 == 1761323050);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((-1392072616), (int) (byte) 0);
        int i18 = multiplyService0.multiply((-4073), 0);
        int i21 = multiplyService0.multiply(249110840, 595097060);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1345311264));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
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
        int i30 = sumService0.add(17785, 918681259);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == (-818765408));
        org.junit.Assert.assertTrue(i30 == 918699044);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add((-400482011), 967253556);
        int i12 = sumService0.add(0, 0);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 566771545);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add((-4391), 1335631400);
        int i12 = sumService0.add((-1296581151), (-787016052));
        int i15 = sumService0.add((-1075101257), 20986);
        int i18 = sumService0.add(180900992, 1382088704);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 1335627009);
        org.junit.Assert.assertTrue(i12 == (-2083597203));
        org.junit.Assert.assertTrue(i15 == (-1075080271));
        org.junit.Assert.assertTrue(i18 == 1562989696);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(350, 416);
        int i15 = multiplyService0.multiply((-1296581284), 4200);
        int i18 = multiplyService0.multiply(132, 152);
        int i21 = multiplyService0.multiply(502029312, (-1296578083));
        int i24 = multiplyService0.multiply(0, (-4073));
        int i27 = multiplyService0.multiply((-71587808), (-2092256872));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 145600);
        org.junit.Assert.assertTrue(i15 == 377138528);
        org.junit.Assert.assertTrue(i18 == 20064);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(1351680, 320);
        int i15 = sumService0.add(3200, (-1776064471));
        int i18 = sumService0.add(0, 51454210);
        int i21 = sumService0.add((-1011378815), 2425500);
        int i24 = sumService0.add(247677076, 1691824456);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 1352000);
        org.junit.Assert.assertTrue(i15 == (-1776061271));
        org.junit.Assert.assertTrue(i18 == 51454210);
        org.junit.Assert.assertTrue(i21 == (-1008953315));
        org.junit.Assert.assertTrue(i24 == 1939501532);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add(3209, 319);
        int i9 = sumService0.add(35515, (-778570983));
        int i12 = sumService0.add((-123231112), (-1652866106));
        int i15 = sumService0.add(1014150138, (-343474176));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 3528);
        org.junit.Assert.assertTrue(i9 == (-778535468));
        org.junit.Assert.assertTrue(i12 == (-1776097218));
        org.junit.Assert.assertTrue(i15 == 670675962);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add((-1019881610), 1311579965);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 291698355);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add(318, 51449979);
        int i24 = sumService0.add(14710, 1154199698);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 51450297);
        org.junit.Assert.assertTrue(i24 == 1154214408);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
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
        int i30 = sumService0.add(1328961975, 1125541544);
        int i33 = sumService0.add(42800748, 0);
        int i36 = sumService0.add(353133259, (-1161594683));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 234);
        org.junit.Assert.assertTrue(i24 == 914894621);
        org.junit.Assert.assertTrue(i27 == 175134978);
        org.junit.Assert.assertTrue(i30 == (-1840463777));
        org.junit.Assert.assertTrue(i33 == 42800748);
        org.junit.Assert.assertTrue(i36 == (-808461424));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((-40840), (-1095912125));
        int i15 = sumService0.add((-2031785670), (int) (short) 10);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1095952965));
        org.junit.Assert.assertTrue(i15 == (-2031785660));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (byte) -1, 0);
        int i15 = multiplyService0.multiply(0, (int) ' ');
        int i18 = multiplyService0.multiply(1920676996, (-1220732288));
        int i21 = multiplyService0.multiply(555637214, 2037482854);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1882839948));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-4073), 3209);
        int i15 = multiplyService0.multiply((-13129), 516);
        int i18 = multiplyService0.multiply((-818780118), 193);
        int i21 = multiplyService0.multiply(350, 921106759);
        int i24 = multiplyService0.multiply((-204783124), 1080336032);
        int i27 = multiplyService0.multiply(1624244224, 855238996);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == (-13070257));
        org.junit.Assert.assertTrue(i15 == (-6774564));
        org.junit.Assert.assertTrue(i18 == 889227178);
        org.junit.Assert.assertTrue(i21 == 264818450);
        org.junit.Assert.assertTrue(i24 == (-1847010432));
        org.junit.Assert.assertTrue(i27 == 339738624);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (short) 0, (-1));
        int i15 = sumService0.add(21632, (-40840));
        int i18 = sumService0.add(1296581284, (int) (short) 10);
        int i21 = sumService0.add(318, 51449979);
        int i24 = sumService0.add(0, 376390144);
        int i27 = sumService0.add((int) 'a', 72908080);
        int i30 = sumService0.add((-628008130), 377138528);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 51450297);
        org.junit.Assert.assertTrue(i24 == 376390144);
        org.junit.Assert.assertTrue(i27 == 72908177);
        org.junit.Assert.assertTrue(i30 == (-250869602));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(559154858, 320);
        int i21 = multiplyService0.multiply((-379527007), 1489053800);
        int i24 = multiplyService0.multiply(2096518976, 365899533);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1459071872));
        org.junit.Assert.assertTrue(i21 == (-1546294936));
        org.junit.Assert.assertTrue(i24 == 1598500416);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply(0, 10);
        int i12 = multiplyService0.multiply((-2081677312), (int) (byte) -1);
        int i15 = multiplyService0.multiply(142, (-83));
        int i18 = multiplyService0.multiply(559154858, 320);
        int i21 = multiplyService0.multiply(0, (-827083360));
        int i24 = multiplyService0.multiply(249110840, (-713157760));
        int i27 = multiplyService0.multiply(377150525, 158694790);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1459071872));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-1900408594));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(1474200, (int) (byte) 0);
        int i15 = multiplyService0.multiply(0, 160586392);
        int i18 = multiplyService0.multiply(2035715912, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-1), (-4392));
        int i12 = multiplyService0.multiply(1386193495, (-1536935));
        int i15 = multiplyService0.multiply((-1176980632), (-1398925746));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply(379527007, (-13312));
        int i21 = multiplyService0.multiply(1089162661, 1772188476);
        int i24 = multiplyService0.multiply(1212493300, 270389673);
        int i27 = multiplyService0.multiply((-382590128), (-1338758104));
        int i30 = multiplyService0.multiply(236954880, 196083712);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1825329580);
        org.junit.Assert.assertTrue(i24 == (-1529640428));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 1879048192);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
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
        int i36 = multiplyService0.multiply(1670738110, 1452940604);
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
        org.junit.Assert.assertTrue(i36 == (-350752120));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply(0, 318);
        int i15 = multiplyService0.multiply(4200, (int) (byte) 0);
        int i18 = multiplyService0.multiply((-6778883), 236990600);
        int i21 = multiplyService0.multiply((-1335626144), (-349672704));
        int i24 = multiplyService0.multiply(1956552024, 643212544);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 967569000);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 653899776);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((-32), 350);
        int i9 = sumService0.add((int) (short) -1, (int) (byte) 10);
        int i12 = sumService0.add((-726304512), (-1652043432));
        int i15 = sumService0.add((-681746432), 2443188);
        int i18 = sumService0.add(2344320, (-951905885));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 318);
        org.junit.Assert.assertTrue(i9 == 9);
        org.junit.Assert.assertTrue(i12 == 1916619352);
        org.junit.Assert.assertTrue(i15 == (-679303244));
        org.junit.Assert.assertTrue(i18 == (-949561565));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(133, (int) (short) 1);
        int i18 = sumService0.add(0, (-713157760));
        int i21 = sumService0.add(1125541544, 1922224165);
        int i24 = sumService0.add((-13147), 1309520648);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 134);
        org.junit.Assert.assertTrue(i18 == (-713157760));
        org.junit.Assert.assertTrue(i21 == (-1247201587));
        org.junit.Assert.assertTrue(i24 == 1309507501);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply((-318), 0);
        int i30 = multiplyService0.multiply(3755, (-1896386558));
        int i33 = multiplyService0.multiply(14560235, (-1629091072));
        int i36 = multiplyService0.multiply((-2092256872), (-1968203376));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add(653328384, 2035877461);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == (-1605761451));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) (byte) 10, (-4402));
        int i15 = sumService0.add(17688, (int) 'a');
        int i18 = sumService0.add(145600, 147000);
        int i21 = sumService0.add(1335627009, 0);
        int i24 = sumService0.add((int) (byte) 100, 3720);
        int i27 = sumService0.add(2116579371, (-1373994118));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-4392));
        org.junit.Assert.assertTrue(i15 == 17785);
        org.junit.Assert.assertTrue(i18 == 292600);
        org.junit.Assert.assertTrue(i21 == 1335627009);
        org.junit.Assert.assertTrue(i24 == 3820);
        org.junit.Assert.assertTrue(i27 == 742585253);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply((int) ' ', 10);
        int i21 = multiplyService0.multiply(134, 17688);
        int i24 = multiplyService0.multiply((int) '#', (-32));
        int i27 = multiplyService0.multiply(0, 1328957751);
        int i30 = multiplyService0.multiply(855238996, 1599313021);
        int i33 = multiplyService0.multiply(325338392, (-1390782493));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == 2370192);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i30 == 824671748);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, 914908945);
        int i15 = multiplyService0.multiply(217329481, 1309517028);
        int i18 = multiplyService0.multiply(394431477, (-1830723464));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 559154858);
        org.junit.Assert.assertTrue(i15 == (-1669734140));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply(236990600, 51449979);
        int i21 = multiplyService0.multiply(914894112, (-1220810752));
        int i24 = multiplyService0.multiply((-828353057), (-258687196));
        int i27 = multiplyService0.multiply((-1604198979), 1412238912);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == (-1652043432));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 1892730176);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((int) ' ', 100);
        int i12 = multiplyService0.multiply(133, (int) ' ');
        int i15 = multiplyService0.multiply((-4073), 51449979);
        int i18 = multiplyService0.multiply(1335631400, (-1346170880));
        int i21 = multiplyService0.multiply((-1635471702), 565801094);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 4256);
        org.junit.Assert.assertTrue(i15 == 897633037);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 683134204);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
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
        int i30 = multiplyService0.multiply(749371392, 44261636);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 320);
        org.junit.Assert.assertTrue(i21 == (-13312));
        org.junit.Assert.assertTrue(i24 == 249110840);
        org.junit.Assert.assertTrue(i27 == (-1088093480));
        org.junit.Assert.assertTrue(i30 == (-852885504));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(416, 1382088705);
        int i18 = sumService0.add(377138528, (int) (short) -1);
        int i21 = sumService0.add((-1652043432), (-236821640));
        int i24 = sumService0.add(738560980, 756511759);
        int i27 = sumService0.add(1879048192, 1319705344);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 1382089121);
        org.junit.Assert.assertTrue(i18 == 377138527);
        org.junit.Assert.assertTrue(i21 == (-1888865072));
        org.junit.Assert.assertTrue(i24 == 1495072739);
        org.junit.Assert.assertTrue(i27 == (-1096213760));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply((-318), 882521996);
        int i21 = multiplyService0.multiply(3209, 918681227);
        int i24 = multiplyService0.multiply(1920794624, 1489053800);
        int i27 = multiplyService0.multiply(0, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == (-1469120488));
        org.junit.Assert.assertTrue(i21 == 1700492387);
        org.junit.Assert.assertTrue(i24 == 180879360);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add((int) '4', 1);
        int i9 = sumService0.add((int) (byte) 0, (int) 'a');
        int i12 = sumService0.add(845447382, (-1466640848));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 53);
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertTrue(i12 == (-621193466));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add((-733692672), 889227178);
        int i15 = sumService0.add(818780118, 1328957751);
        int i18 = sumService0.add((int) (short) -1, 0);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 155534506);
        org.junit.Assert.assertTrue(i15 == (-2147229427));
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(3209, (int) (byte) 1);
        int i15 = multiplyService0.multiply(392822784, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) '4', 1);
        int i12 = sumService0.add((-1296581151), 375605048);
        int i15 = sumService0.add(292600, 1166302803);
        int i18 = sumService0.add(0, 921106759);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 53);
        org.junit.Assert.assertTrue(i12 == (-920976103));
        org.junit.Assert.assertTrue(i15 == 1166595403);
        org.junit.Assert.assertTrue(i18 == 921106759);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply(42, 377156815);
        int i12 = multiplyService0.multiply(79044516, 1923399140);
        int i15 = multiplyService0.multiply(1382089121, 363774046);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1339282954));
        org.junit.Assert.assertTrue(i12 == (-190823920));
        org.junit.Assert.assertTrue(i15 == 1363499294);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply(21632, (-13070257));
        int i12 = multiplyService0.multiply((-661706111), 160596188);
        int i15 = multiplyService0.multiply(810547712, (-1898952389));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1994065628);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((int) '4', (int) (byte) -1);
        int i18 = multiplyService0.multiply(373424552, 1599313021);
        int i21 = multiplyService0.multiply((-704669184), 516);
        int i24 = multiplyService0.multiply(752807629, 392822784);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-391647480));
        org.junit.Assert.assertTrue(i21 == 1462921216);
        org.junit.Assert.assertTrue(i24 == 1273102336);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply(1, (int) (short) 10);
        int i15 = multiplyService0.multiply(14833, 377138625);
        int i18 = multiplyService0.multiply(1045170576, 0);
        int i21 = multiplyService0.multiply((-2081690441), 1759245869);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 2049805233);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == (-1099074005));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply(51450319, 1335631400);
        int i24 = multiplyService0.multiply((-1602593409), (-1679585984));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == 904202840);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
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
        int i30 = sumService0.add((-1334553088), 1829254332);
        int i33 = sumService0.add((-1292427488), 1909292992);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == (-818765408));
        org.junit.Assert.assertTrue(i30 == 494701244);
        org.junit.Assert.assertTrue(i33 == 616865504);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((-4402), 318);
        int i12 = sumService0.add((int) ' ', 10);
        int i15 = sumService0.add(14560032, 9);
        int i18 = sumService0.add(160575202, 20986);
        int i21 = sumService0.add(379527007, 2046336526);
        int i24 = sumService0.add(1152773688, 1660944384);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == 42);
        org.junit.Assert.assertTrue(i15 == 14560041);
        org.junit.Assert.assertTrue(i18 == 160596188);
        org.junit.Assert.assertTrue(i21 == (-1869103763));
        org.junit.Assert.assertTrue(i24 == (-1481249224));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(9, 194);
        int i12 = sumService0.add(160596188, 296574976);
        int i15 = sumService0.add(142, 1496602044);
        int i18 = sumService0.add(2035715912, (-917043906));
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 203);
        org.junit.Assert.assertTrue(i12 == 457171164);
        org.junit.Assert.assertTrue(i15 == 1496602186);
        org.junit.Assert.assertTrue(i18 == 1118672006);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add((int) (byte) 0, 97);
        int i9 = sumService0.add(152, 42);
        int i12 = sumService0.add(379504635, 10);
        int i15 = sumService0.add((-682497744), 17785);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 97);
        org.junit.Assert.assertTrue(i9 == 194);
        org.junit.Assert.assertTrue(i12 == 379504645);
        org.junit.Assert.assertTrue(i15 == (-682479959));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply(164752000, 14546853);
        int i12 = multiplyService0.multiply((-482980236), 4200);
        int i15 = multiplyService0.multiply((-664924319), (-1077445373));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 1309516928);
        org.junit.Assert.assertTrue(i12 == (-1292427488));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply((int) (byte) 0, 1474200);
        int i21 = multiplyService0.multiply((-4329), (-861118659));
        int i24 = multiplyService0.multiply(0, 874002638);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((int) (byte) 10, 14700);
        int i12 = multiplyService0.multiply((-1339282954), (int) ' ');
        int i15 = multiplyService0.multiply((-444431728), 904202840);
        int i18 = multiplyService0.multiply(377156815, 160575202);
        int i21 = multiplyService0.multiply(160594284, 350);
        int i24 = multiplyService0.multiply((-1731821051), (-827083360));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == 147000);
        org.junit.Assert.assertTrue(i12 == 92618432);
        org.junit.Assert.assertTrue(i15 == (-1731821184));
        org.junit.Assert.assertTrue(i18 == (-711503682));
        org.junit.Assert.assertTrue(i21 == 373424552);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(4224, 4224);
        int i9 = multiplyService0.multiply((-318), (int) (byte) 1);
        int i12 = multiplyService0.multiply((-1330523392), (-912599118));
        int i15 = multiplyService0.multiply((-713157760), (-1430731640));
        int i18 = multiplyService0.multiply(1686656510, 241426646);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 17842176);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 2054169172);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(1759245869, 918681259);
        int i9 = sumService0.add(72908177, 36);
        int i12 = sumService0.add(1922224165, (-1537067));
        int i15 = sumService0.add(763495529, 1599313021);
        int i18 = sumService0.add(1894292752, (-1652866106));
        int i21 = sumService0.add(701, 261048320);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == (-1617040168));
        org.junit.Assert.assertTrue(i9 == 72908213);
        org.junit.Assert.assertTrue(i12 == 1920687098);
        org.junit.Assert.assertTrue(i15 == (-1932158746));
        org.junit.Assert.assertTrue(i18 == 241426646);
        org.junit.Assert.assertTrue(i21 == 261049021);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 100, 914908945);
        int i15 = multiplyService0.multiply(101, (-1652043432));
        int i18 = multiplyService0.multiply(514000866, 11937480);
        int i21 = multiplyService0.multiply(1797416241, 1360979652);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 1296581284);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1120553840));
        org.junit.Assert.assertTrue(i21 == 1241350020);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '4', 416);
        int i9 = multiplyService0.multiply(914894112, (int) (byte) -1);
        int i12 = multiplyService0.multiply(1598341120, 0);
        int i15 = multiplyService0.multiply((-1521662480), 154047106);
        int i18 = multiplyService0.multiply(438817792, 339738624);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 21632);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 71328736);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((-912619971), 17688);
        int i15 = multiplyService0.multiply(1146187962, (-763496197));
        int i18 = multiplyService0.multiply(0, 1909292992);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == (-1934948680));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply(3209, (int) (byte) 1);
        int i15 = multiplyService0.multiply(18190, (-1174622667));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 3209);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (short) 1, (-1199150660));
        int i12 = sumService0.add(1372804491, 1118672006);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == (-1199150659));
        org.junit.Assert.assertTrue(i12 == (-1803490799));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
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
        int i30 = sumService0.add(1328961975, 1125541544);
        int i33 = sumService0.add(42800748, 0);
        int i36 = sumService0.add(363774046, (-1655782804));
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == (-4084));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == (-19208));
        org.junit.Assert.assertTrue(i18 == 1296581294);
        org.junit.Assert.assertTrue(i21 == 234);
        org.junit.Assert.assertTrue(i24 == 914894621);
        org.junit.Assert.assertTrue(i27 == 175134978);
        org.junit.Assert.assertTrue(i30 == (-1840463777));
        org.junit.Assert.assertTrue(i33 == 42800748);
        org.junit.Assert.assertTrue(i36 == (-1292008758));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add((int) (byte) 1, 9);
        int i12 = sumService0.add(133, (-1537200));
        int i15 = sumService0.add(1474200, (-318));
        int i18 = sumService0.add(1710392717, 2369906);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i12 == (-1537067));
        org.junit.Assert.assertTrue(i15 == 1473882);
        org.junit.Assert.assertTrue(i18 == 1712762623);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply(97, (int) (short) 0);
        int i12 = multiplyService0.multiply((int) (short) 1, (int) (short) 100);
        int i15 = multiplyService0.multiply((int) (short) 0, 31);
        int i18 = multiplyService0.multiply((-32), (-349672704));
        int i21 = multiplyService0.multiply(1772188476, 1309516928);
        int i24 = multiplyService0.multiply(0, (-379527007));
        int i27 = multiplyService0.multiply(37614080, (-13312));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1620577792);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(10, (int) '#');
        int i9 = multiplyService0.multiply((int) (byte) -1, 318);
        int i12 = multiplyService0.multiply((int) (short) 100, 2369906);
        int i15 = multiplyService0.multiply((int) (byte) -1, 319);
        int i18 = multiplyService0.multiply((-4392), 350);
        int i21 = multiplyService0.multiply(51450319, 1335631400);
        int i24 = multiplyService0.multiply(0, 4200);
        int i27 = multiplyService0.multiply(918681259, 1460888);
        int i30 = multiplyService0.multiply((-1011378815), (-778557619));
        int i33 = multiplyService0.multiply(217329481, 1588940836);
        int i36 = multiplyService0.multiply((-1414688128), (-626325562));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 350);
        org.junit.Assert.assertTrue(i9 == (-318));
        org.junit.Assert.assertTrue(i12 == 236990600);
        org.junit.Assert.assertTrue(i15 == (-319));
        org.junit.Assert.assertTrue(i18 == (-1537200));
        org.junit.Assert.assertTrue(i21 == 904202840);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-953556088));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i33 == 1572501060);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(1, (-1));
        int i15 = sumService0.add((int) ' ', 14560000);
        int i18 = sumService0.add(372, (int) (short) 1);
        int i21 = sumService0.add(386, 774556789);
        int i24 = sumService0.add(2366108, (-1296581151));
        int i27 = sumService0.add((-699588608), 416);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 14560032);
        org.junit.Assert.assertTrue(i18 == 373);
        org.junit.Assert.assertTrue(i21 == 774557175);
        org.junit.Assert.assertTrue(i24 == (-1294215043));
        org.junit.Assert.assertTrue(i27 == (-699588192));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
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
        int i30 = multiplyService0.multiply((-1635471702), (-1888865072));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 1825329580);
        org.junit.Assert.assertTrue(i24 == 1710392717);
        org.junit.Assert.assertTrue(i27 == 392822784);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply(0, 31);
        int i9 = multiplyService0.multiply((int) (byte) 100, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, 914908945);
        int i15 = multiplyService0.multiply((-1869983591), 130219616);
        int i18 = multiplyService0.multiply((-13070257), 818776312);
        int i21 = multiplyService0.multiply((-293626074), (-250234176));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 3200);
        org.junit.Assert.assertTrue(i12 == 559154858);
        org.junit.Assert.assertTrue(i15 == (-1295513760));
        org.junit.Assert.assertTrue(i18 == (-1430731640));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '4', 1);
        int i6 = sumService0.add(9, 133);
        int i9 = sumService0.add(318, (int) (byte) 1);
        int i12 = sumService0.add(350, 36);
        int i15 = sumService0.add((-1), 0);
        int i18 = sumService0.add(1, 318);
        int i21 = sumService0.add((-364057955), 51450152);
        int i24 = sumService0.add(296574976, (-6778883));
        int i27 = sumService0.add((-778560828), 440136651);
        org.junit.Assert.assertTrue(i3 == 53);
        org.junit.Assert.assertTrue(i6 == 142);
        org.junit.Assert.assertTrue(i9 == 319);
        org.junit.Assert.assertTrue(i12 == 386);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i18 == 319);
        org.junit.Assert.assertTrue(i21 == (-312607803));
        org.junit.Assert.assertTrue(i24 == 289796093);
        org.junit.Assert.assertTrue(i27 == (-338424177));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) (short) 1, 318);
        int i6 = sumService0.add(36, 97);
        int i9 = sumService0.add((int) (short) 100, 818775862);
        int i12 = sumService0.add((-290783232), (-319));
        int i15 = sumService0.add(290089043, 1669198191);
        org.junit.Assert.assertTrue(i3 == 319);
        org.junit.Assert.assertTrue(i6 == 133);
        org.junit.Assert.assertTrue(i9 == 818775962);
        org.junit.Assert.assertTrue(i12 == (-290783551));
        org.junit.Assert.assertTrue(i15 == 1959287234);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
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
        int i30 = multiplyService0.multiply(2026602496, 1797416241);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 76440000);
        org.junit.Assert.assertTrue(i24 == (-1243225992));
        org.junit.Assert.assertTrue(i27 == 363756358);
        org.junit.Assert.assertTrue(i30 == 1752399872);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply(100, 14700);
        int i18 = multiplyService0.multiply((int) (byte) 0, 1474200);
        int i21 = multiplyService0.multiply(918681259, (-1077463158));
        int i24 = multiplyService0.multiply((-1127180196), (-215785902));
        int i27 = multiplyService0.multiply(51471642, 967569000);
        int i30 = multiplyService0.multiply((-1833753176), 818776312);
        int i33 = multiplyService0.multiply(1691824456, (-732507466));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 1470000);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == (-1116914032));
        org.junit.Assert.assertTrue(i30 == (-250234176));
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (byte) 10, (int) (byte) 10);
        int i9 = multiplyService0.multiply((int) (byte) -1, (int) ' ');
        int i12 = multiplyService0.multiply((int) (byte) 0, (int) (short) 1);
        int i15 = multiplyService0.multiply((-31), 142);
        int i18 = multiplyService0.multiply(193, (-1));
        int i21 = multiplyService0.multiply((-1296578083), 0);
        int i24 = multiplyService0.multiply(236954880, 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 100);
        org.junit.Assert.assertTrue(i9 == (-32));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == (-4402));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) -1, 0);
        int i9 = multiplyService0.multiply(132, (int) ' ');
        int i12 = multiplyService0.multiply((int) (short) 10, (int) (short) 1);
        int i15 = multiplyService0.multiply((int) ' ', 372);
        int i18 = multiplyService0.multiply((-1912725504), (-726304512));
        int i21 = multiplyService0.multiply(845447382, 51450297);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 4224);
        org.junit.Assert.assertTrue(i12 == 10);
        org.junit.Assert.assertTrue(i15 == 11904);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i21 == 660951206);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (short) -1, (int) ' ');
        int i9 = sumService0.add(142, (int) (short) 10);
        int i12 = sumService0.add(133, 133);
        int i15 = sumService0.add((-4084), 2370192);
        int i18 = sumService0.add(17760, 1759245869);
        int i21 = sumService0.add(712023936, 377138725);
        int i24 = sumService0.add(1500649660, (-2079704743));
        int i27 = sumService0.add(0, (-1615688488));
        int i30 = sumService0.add(1759263629, 247677076);
        int i33 = sumService0.add((-1128323824), (-1445764002));
        int i36 = sumService0.add(1599313021, (-1075101257));
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 31);
        org.junit.Assert.assertTrue(i9 == 152);
        org.junit.Assert.assertTrue(i12 == 266);
        org.junit.Assert.assertTrue(i15 == 2366108);
        org.junit.Assert.assertTrue(i18 == 1759263629);
        org.junit.Assert.assertTrue(i21 == 1089162661);
        org.junit.Assert.assertTrue(i24 == (-579055083));
        org.junit.Assert.assertTrue(i27 == (-1615688488));
        org.junit.Assert.assertTrue(i30 == 2006940705);
        org.junit.Assert.assertTrue(i33 == 1720879470);
        org.junit.Assert.assertTrue(i36 == 524211764);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        randoop_sample.SumService sumService0 = new randoop_sample.SumService();
        int i3 = sumService0.add((int) '#', (int) (short) 1);
        int i6 = sumService0.add((int) (byte) 10, (int) (short) -1);
        int i9 = sumService0.add(1, 559154858);
        int i12 = sumService0.add(0, 372);
        int i15 = sumService0.add((int) (short) 1, 1382088704);
        int i18 = sumService0.add(51471642, 1296581284);
        int i21 = sumService0.add(18190, 377138625);
        int i24 = sumService0.add(377157165, 1382088704);
        int i27 = sumService0.add((-1496527537), 1909292992);
        org.junit.Assert.assertTrue(i3 == 36);
        org.junit.Assert.assertTrue(i6 == 9);
        org.junit.Assert.assertTrue(i9 == 559154859);
        org.junit.Assert.assertTrue(i12 == 372);
        org.junit.Assert.assertTrue(i15 == 1382088705);
        org.junit.Assert.assertTrue(i18 == 1348052926);
        org.junit.Assert.assertTrue(i21 == 377156815);
        org.junit.Assert.assertTrue(i24 == 1759245869);
        org.junit.Assert.assertTrue(i27 == 412765455);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) (short) 1, (int) (short) 0);
        int i9 = multiplyService0.multiply((int) (short) -1, (-4402));
        int i12 = multiplyService0.multiply((int) (byte) 10, 0);
        int i15 = multiplyService0.multiply(1351680, (-2105583122));
        int i18 = multiplyService0.multiply((-1582778399), (-2079704743));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        randoop_sample.MultiplyService multiplyService0 = new randoop_sample.MultiplyService();
        int i3 = multiplyService0.multiply((int) '#', 0);
        int i6 = multiplyService0.multiply((int) '#', (-1));
        int i9 = multiplyService0.multiply((-4207), 2370192);
        int i12 = multiplyService0.multiply(3200, 377138625);
        int i15 = multiplyService0.multiply(234, (-1227134415));
        int i18 = multiplyService0.multiply(79044516, 710279168);
        int i21 = multiplyService0.multiply(1494176544, 1920687098);
        int i24 = multiplyService0.multiply((-1249959424), (-4073));
        int i27 = multiplyService0.multiply(1496602141, (-1340173744));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == (-1381463152));
        org.junit.Assert.assertTrue(i12 == (-42210176));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i18 == (-1994915840));
        org.junit.Assert.assertTrue(i21 == (-1679585984));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }
}

