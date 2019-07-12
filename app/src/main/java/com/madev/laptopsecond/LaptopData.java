package com.madev.laptopsecond;

import java.util.ArrayList;

public class LaptopData {
    public static String [][] data =new String[][]{
            {"Lenovo Thinkpad X240", "Rp. 2.800.000", "https://i.ytimg.com/vi/FGcWTladi9A/maxresdefault.jpg"},
            {"Dell Latitude E6420", "Rp. 2.400.000", "https://mall.wikiobralan.com/bestsellers/1050/product/img/9978149042/w-700/2018_03_17T23_15_09_07_00.jpg"},
            {"HP Elitebook 8470p", "Rp. 2.550.000", "https://murah.netpriceupdate.com/bestsellers/1050/product/img/7956279491/w-700/2017_11_22T20_35_08_07_00.jpg"},
            {"Toshiba Portege R30", "Rp. 2.800.000", "https://s0.bukalapak.com/img/5584721093/w-1000/Toshiba_Portege_R30___i5_Gen4___4GB___500GB___13_inch___Beka.jpg.webp"},
            {"NEC VersaPro VY24GX", "Rp. 1.800.000", "https://s1.bukalapak.com/img/1043696293/w-1000/NEC_VersaPro_VY24GX___i5_Gen1___4GB___120GB_HDD___14_inch___.jpg.webp"},
            {"Macbook Pro 13 - I5 - Mid 2012", "Rp. 7.150.000", "https://s2.bukalapak.com/img/2189085161/w-1000/Macbook_Pro_13___i5___Mid_2012___Bekas.jpg.webp"},
            {"Toshiba Tecra Z50", "Rp. 5.500.000", "https://s0.bukalapak.com/img/5296161015/w-1000/z50.jpg.webp"},
            {"Hp Elitebook Folio 9480m", "Rp. 3.850.000", "https://s3.bukalapak.com/img/3263786604/w-1000/folio.jpg.webp"},
            {"Fujitsu Core I7 Lifebook", "Rp. 4.950.000", "https://s2.bukalapak.com/img/26486125101/w-1000/Fujitsu_Core_i7_Lifebook_Nvidia_Geforce.jpg.webp"},
            {"Asus Zenbook UX330U", "Rp. 8.500.000", "https://s1.bukalapak.com/img/11144273011/w-1000/zen2.jpg.webp"}
    };
    public static ArrayList<Laptop> getListData()
    {
        Laptop laptop =null;
        ArrayList<Laptop> list = new ArrayList<>();
        for (String[] aData:data){
            laptop = new Laptop();
            laptop.setName(aData[0]);
            laptop.setPrice(aData[1]);
            laptop.setPhoto(aData[2]);
            list.add(laptop);
        }
        return list;
    }
}
