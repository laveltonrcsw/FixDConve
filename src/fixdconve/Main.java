package fixdconve;


public
        class Main
{

    /**
     * @param args the command line arguments
     */
    public static
            void main(String[] args) throws Exception
    {
        String VinNum = "1GCEK19Z66Z167152";
        vindecode mVinInfo = new vindecode();

        String SysInfo = "";
        SysInfo = System.getProperty("os.name");
        SysInfo = SysInfo + " v" + System.getProperty("os.version");
        SysInfo = SysInfo + " (" + System.getProperty("os.arch") + ")";

        System.out.println(SysInfo);
        System.out.print("\n");
        System.out.print("The Vehicle Serial: " + VinNum.toUpperCase());
        System.out.print("\n");
        System.out.print("The Vehicle Make..: " + mVinInfo.getVinMake(VinNum.toUpperCase()));
        System.out.print("\n");
        System.out.print("The Vehicle Model.: " + mVinInfo.getVinModel(VinNum.toUpperCase()));
        System.out.print("\n");
        System.out.print("The Vehicle Year..: " + mVinInfo.getVinYear(VinNum.toUpperCase()));
        System.out.print("\n");
        //opndbase.testDriver2();
    }
}
