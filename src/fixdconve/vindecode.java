package fixdconve;

public
        class vindecode
{

    /**
     *
     * @param VinNumber A VIN number is a 17-character alphanumeric identifier or a manufacturer???s serial number.
     * @return The return value is either true or false.
     */
    private
            boolean IsVinValid(String VinNumber)
    {
        String sVin = VinNumber;
        int iVinLen = sVin.length();
        boolean bValid = true;
        String[] sVinList =
        {
            "00000000000000000", "11111111111111111", "22222222222222222", "33333333333333333",
            "44444444444444444", "55555555555555555", "66666666666666666", "77777777777777777",
            "88888888888888888", "99999999999999999", "AAAAAAAAAAAAAAAAA", "BBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCCCC", "DDDDDDDDDDDDDDDDD", "EEEEEEEEEEEEEEEEE", "FFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGG", "HHHHHHHHHHHHHHHHH", "IIIIIIIIIIIIIIIII", "JJJJJJJJJJJJJJJJJ",
            "KKKKKKKKKKKKKKKKK", "LLLLLLLLLLLLLLLLL", "MMMMMMMMMMMMMMMMM", "NNNNNNNNNNNNNNNNN",
            "OOOOOOOOOOOOOOOOO", "PPPPPPPPPPPPPPPPP", "QQQQQQQQQQQQQQQQQ", "RRRRRRRRRRRRRRRRR",
            "SSSSSSSSSSSSSSSSS", "TTTTTTTTTTTTTTTTT", "UUUUUUUUUUUUUUUUU", "VVVVVVVVVVVVVVVVV",
            "WWWWWWWWWWWWWWWWW", "XXXXXXXXXXXXXXXXX", "YYYYYYYYYYYYYYYYY", "ZZZZZZZZZZZZZZZZZ"
        };

        if (iVinLen == 17)
        {
            for (String sBadVins : sVinList)
            {
                if (sVin.equals(sBadVins))
                {
                    bValid = false;
                }
                else
                {
                    bValid = true;
                }
            }
        }
        else
        {
            bValid = false;
        }

        return bValid;
    }

    /**
     *
     * @param VinNumber A VIN number is a 17-character alphanumeric identifier or a manufacturer???s serial number.
     * @return The vehicle's model year.
     */
    public
            String getVinYear(String VinNumber)
    {
        String sYear = "";
        String sVin = VinNumber;
        String sYearPos = sVin.substring(9, 10);
        int iVinLen = sVin.length();

        if (iVinLen == 17 & IsVinValid(sVin))
        {
            
            if (sYearPos.equals("L"))
            {
                sYear = "1990";
            }
            else if (sYearPos.equals("M"))
            {
                sYear = "1991";
            }
            else if (sYearPos.equals("N"))
            {
                sYear = "1992";
            }
            else if (sYearPos.equals("P"))
            {
                sYear = "1993";
            }
            else if (sYearPos.equals("R"))
            {
                sYear = "1994";
            }
            else if (sYearPos.equals("S"))
            {
                sYear = "1995";
            }
            else if (sYearPos.equals("T"))
            {
                sYear = "1996";
            }
            else if (sYearPos.equals("V"))
            {
                sYear = "1997";
            }
            else if (sYearPos.equals("W"))
            {
                sYear = "1998";
            }
            else if (sYearPos.equals("X"))
            {
                sYear = "1999";
            }
            else if (sYearPos.equals("Y"))
            {
                sYear = "2000";
            }
            else if (sYearPos.equals("1"))
            {
                sYear = "2001";
            }
            else if (sYearPos.equals("2"))
            {
                sYear = "2002";
            }
            else if (sYearPos.equals("3"))
            {
                sYear = "2003";
            }
            else if (sYearPos.equals("4"))
            {
                sYear = "2004";
            }
            else if (sYearPos.equals("5"))
            {
                sYear = "2005";
            }
            else if (sYearPos.equals("6"))
            {
                sYear = "2006";
            }
            else if (sYearPos.equals("7"))
            {
                sYear = "2007";
            }
            else if (sYearPos.equals("8"))
            {
                sYear = "2008";
            }
            else if (sYearPos.equals("9"))
            {
                sYear = "2009";
            }
            else if (sYearPos.equals("A"))
            {
                sYear = "2010";
            }
            else if (sYearPos.equals("B"))
            {
                sYear = "2011";
            }
            else if (sYearPos.equals("C"))
            {
                sYear = "2012";
            }
            else if (sYearPos.equals("D"))
            {
                sYear = "2013";
            }
            else if (sYearPos.equals("E"))
            {
                sYear = "2014";
            }
            else if (sYearPos.equals("F"))
            {
                sYear = "2015";
            }
            else if (sYearPos.equals("G"))
            {
                sYear = "2016";
            }
            else if (sYearPos.equals("H"))
            {
                sYear = "2017";
            }
            else if (sYearPos.equals("J"))
            {
                sYear = "2018";
            }
            else if (sYearPos.equals("K"))
            {
                sYear = "2019";
            }
            else
            {
                sYear = "1977";
            }
        }
        else
        {
            sYear = "1977";
        }

        return sYear;
    }

    /**
     *
     * @param VinNumber A VIN number is a 17-character alphanumeric identifier or a manufacturer???s serial number.
     * @return The vehicle's make.
     */
    public
            String getVinMake(String VinNumber)
    {
        String sMake = "";
        String sVin = VinNumber;
        String sMakePos = sVin.substring(0, 3);
        int iVinLen = sVin.length();
        if (iVinLen == 17 & IsVinValid(sVin))
        {
            // Passenger Car VIN System
            if (sMakePos.equals("1G1"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("2G1"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("3G1"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("KL1"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("1G2"))
            {
                sMake = "Pontiac";
            }
            else if (sMakePos.equals("2G2"))
            {
                sMake = "Pontiac";
            }
            else if (sMakePos.equals("3G2"))
            {
                sMake = "Pontiac";
            }
            else if (sMakePos.equals("5G2"))
            {
                sMake = "Pontiac";
            }
            else if (sMakePos.equals("6G2"))
            {
                sMake = "Pontiac";
            }
            else if (sMakePos.equals("KL2"))
            {
                sMake = "Pontiac";
            }
            else if (sMakePos.equals("1G4"))
            {
                sMake = "Buick";
            }
            else if (sMakePos.equals("2G4"))
            {
                sMake = "Buick";
            }
            else if (sMakePos.equals("1G6"))
            {
                sMake = "Cadillac";
            }
            else if (sMakePos.equals("LSG"))
            {
                sMake = "Cadillac";
            }
            else if (sMakePos.equals("1G8"))
            {
                sMake = "Saturn";
            }
            else if (sMakePos.equals("W08"))
            {
                sMake = "Saturn";
            }
            // Light Duty Truck, Multipurpose Passenger Vehicle (MPV), Incomplete Vehicle VIN System
            else if (sMakePos.equals("1GB"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("2GB"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("3GB"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("1GC"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("2GC"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("3GC"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("1GA"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("1GN"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("3GN"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("2CN"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("1GD"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("2GD"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("3GD"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("1GT"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("2GT"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("3GT"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("1GJ"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("1GK"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("3GK"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("3G5"))
            {
                sMake = "Buick";
            }
            else if (sMakePos.equals("4GL"))
            {
                sMake = "Buick";
            }
            else if (sMakePos.equals("5GA"))
            {
                sMake = "Buick";
            }
            else if (sMakePos.equals("5S3"))
            {
                sMake = "Saab";
            }
            else if (sMakePos.equals("3GS"))
            {
                sMake = "Saturn";
            }
            else if (sMakePos.equals("4NT"))
            {
                sMake = "Saturn";
            }
            else if (sMakePos.equals("5GZ"))
            {
                sMake = "Saturn";
            }
            else if (sMakePos.equals("1GE"))
            {
                sMake = "Cadillac";
            }
            else if (sMakePos.equals("1GY"))
            {
                sMake = "Cadillac";
            }
            else if (sMakePos.equals("3GY"))
            {
                sMake = "Cadillac";
            }
            else if (sMakePos.equals("LSG"))
            {
                sMake = "Cadillac";
            }
            else if (sMakePos.equals("1G5"))
            {
                sMake = "Pontiac";
            }
            else if (sMakePos.equals("1GM"))
            {
                sMake = "Pontiac";
            }
            else if (sMakePos.equals("2CK"))
            {
                sMake = "Pontiac";
            }
            else if (sMakePos.equals("3G7"))
            {
                sMake = "Pontiac";
            }
            else if (sMakePos.equals("5GN"))
            {
                sMake = "Hummer";
            }
            else if (sMakePos.equals("5GR"))
            {
                sMake = "Hummer";
            }
            else if (sMakePos.equals("5GT"))
            {
                sMake = "Hummer";
            }
            // Medium Duty Truck, Incomplete Vehicle VIN System
            else if (sMakePos.equals("1GC"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("2GC"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("1GB"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("2GB"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("4KB"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("J8B"))
            {
                sMake = "Chevrolet";
            }
            else if (sMakePos.equals("1GT"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("2GT"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("1GD"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("2GD"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("4KD"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("J8D"))
            {
                sMake = "GMC";
            }
            else if (sMakePos.equals("4GT"))
            {
                sMake = "Isuzu";
            }
            else if (sMakePos.equals("4KL"))
            {
                sMake = "Isuzu";
            }
            else if (sMakePos.equals("JAL"))
            {
                sMake = "Isuzu";
            }
            else
            {
                sMake = "Unknown Make";
            }
        }
        else
        {
            sMake = "Unknown Make";
        }

        return sMake;
    }

    /**
     *
     * @param VinNumber A VIN number is a 17-character alphanumeric identifier or a manufacturer???s serial number.
     * @return The vehicle's model code.
     */
    public
            String getVinModel(String VinNumber)
    {
        String sModel = "";
        String sVin = VinNumber;
        String sModelPos = sVin.substring(3, 5);
        //int iVinLen = sVin.length();
        sModel = sModelPos;
        return sModel;
    }
}
