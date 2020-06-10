package tech.riseofdevelopers.stars;

import java.util.ArrayList;

public class StarsData {

    private static String[] namaBintang = {

            "Matahari",
            "Sirius",
            "Rigel",
            "Betelgeuse",
            "Aldebaran",
            "Arcturus",
            "Vega",
            "Canopus",
            "Antares",
            "Capella"
    };

    private static String[] detailBintang = {

            "Matahari adalah bintang yang memancarkan cahaya guna menunjang unsur kehidupan di planet bumi. Hal ini dikarenakan, tanpa radiasi sinar matahari tumbuhan tidak dapat melakukan proses fotosintesis sehingga oksigen mustahil menyediakan oksigen di permukaan bumi. Sinar matahari berasal dari api yang bergejolak di permukaannya. Api tersebut bersifat abadi, sekalinya mati maka kehidupan bumi otomatis akan punah.",
            "Bintang Sirius memiliki nama latin Alpha Canis Majoris. Wujud bintang yang paling bersinar terang di malam hari merupakan penampakan dari Sirius. Perhitungan melihat bintang diukur dengan skala magnitudo, bintang Sirius berada dalam angka -1,47. Artinya angka tersebut menjelaskan bahwa sinar Sirius sangat terlihat jelas diantara gemerlap bintang yang lainnya. Pada saat melihat bintang, manusia terfokus pada sebuah rasi.",
            "Rigel merupakan bintang dengan nama latin Beta Orionis. Bintang rigel menempati urutan keenam sebagai predikat kecerahan cahaya yang dipancarkan. Teori keilmiahan menjelaskan bahwa alpha lebih dulu daripada beta. Jadi untuk ukuran kecerahan cahaya, rigel lebih redup daripada vega.",
            "Betelgeuse (pengucapan: /ˈbiːtəldʒuːz/ atau /ˈbɛtəldʒuːz/[6]) (Alpha (α) Orionis) adalah bintang yang terletak 640 tahun cahaya dari Bumi. Bintang ini merupakan bintang paling terang kedua di rasi bintang Orion dan bintang paling terang kesembilan pada langit malam.",
            "Aldebaran masuk dalam rasi bintang Taurus. Dinamakan rasi bintang Taurus karena bentuknya yang mirip kepala banteng lengkap dengan kedua tanduknya. Ukuran bintang aldebaran diperkirakan 44,2 kali lebih besar daripada matahari.",
            "Arcturus Star disebut sebagai bintang biduk oleh masyarakat Indonesia. Nama lain Arcturus Star adalah Alpha Boötis. Sinar yang dipancarkan oleh bintang dengan status paling terang ketiga diduduki oleh Arcturus Star dengan magnitudo -0,05.",
            "Bintang dengan nama latin Alpha Lyrae disebut dengan Vega. Bintang ini berada pada peringkat kelima untuk ukuran kecerahan cahaya yang dipancarkan. Jarak bintang Vega dengan planet bumi adalah 25,3 juta tahun cahaya.",
            "Canopus memiliki nama latin Alpha Carinae. Dalam rasi bintang carina, wujud penampakan yang ditampilkan oleh canopus terlihat paling terang. Namun cahaya yang dipancarkan oleh canopus kalah dengan Sirius. Bintang ini menampakkan diri secara maksimal pada tanggal 28-29 Desember sangat tepat tengah malam. Pada malam biasa, sinar yang dipancarkan canopus tidak bertahan lama",
            "Antares (α Scorpio / Alpha Scorpio) adalah bintang super raksasa merah di rasi bintang scorpio dalam galaksi Bima Sakti dan bintang paling terang ke-16 pada langit malam (kadang-kadang didaftarkan sebagai paling terang ke-15). Bersama dengan Aldebaran, Spica, dan Regulus, bintang ini merupakan salah satu dari empat bintang paling terang di dekat ekliptika.Karena bintang ini sangat besar,bintang yang dalam tata surya terbesar yaitu Matahari sangat kecil dibanding Antares yang sangat besar.",
            "Capella B sering disebut sebagai blue-white giant star. Dari permukaan bumi, bintang ini terlihat seperti perpaduan warna antara putih dengan biru. Ukuran bintang Capella B diperkirakan 90 kali lebih besar daripada matahari."
    };


    private static int [] imgBintang = {

            R.drawable.matahari,
            R.drawable.sirius,
            R.drawable.rigel,
            R.drawable.betelgeuse,
            R.drawable.aldebaran,
            R.drawable.arcturus,
            R.drawable.vega,
            R.drawable.canopus,
            R.drawable.antares,
            R.drawable.capella,


    };

    static ArrayList<Stars> getListData(){
        ArrayList<Stars> list = new ArrayList<>();

        for (int posisi = 0; posisi < namaBintang.length; posisi++){
            Stars bintang = new Stars();
            bintang.setName(namaBintang[posisi]);
            bintang.setDetail(detailBintang[posisi]);
            bintang.setFoto(imgBintang[posisi]);
            list.add(bintang);
        }
        return list;
    }
}
