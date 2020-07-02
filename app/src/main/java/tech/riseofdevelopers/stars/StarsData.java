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
            "Capella",
            "Alpha Centauri A Dan B",
            "Altair",
            "Achernar",
            "Alnilam",
            "Deneb",
            "Hamal",
            "Proxima Centauri",
            "Denebola",
            "Pollux",
            "Regulus",
            "Procyon",
            "Alioth"

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
            "Capella B sering disebut sebagai blue-white giant star. Dari permukaan bumi, bintang ini terlihat seperti perpaduan warna antara putih dengan biru. Ukuran bintang Capella B diperkirakan 90 kali lebih besar daripada matahari.",
            "Alpha Centauri (α Cen / α Centauri); (dikenal juga sebagai Rigil Kentaurus, Rigil Kent, atau Toliman) adalah bintang paling cerah dalam rasi Centaurus. Walaupun tampak seperti satu titik dilihat dengan mata telanjang, bintang ini sebenarnya adalah sistem tiga bintang.",
            "adalah bintang tercerah di rasi Aquila bintang tercerah keduabelas di langit malam. Bintang ini berada pada kategori tipe A dengan magnitudo 0.76 Altair berputar sangat cepat dengan kecepatan 286 km / detik.",
            "Achernar merupakan bintang yang cemerlang, berwarna biru tipe B yang terletak pada jarak 144 tahun cahaya dari Bumi. Meskipun digolong sebagai bintang katai, bintang ini memiliki kecemerlangan 3,000 kali Matahari.\n" +
                    "\n" +
                    "Sampai bulan Maret 2000, Achernar dan Fomalhaut merupakan bintang magnitudo tingkat pertama yang cukup terpencil. Antares, di rasi Scorpius, merupakan bintang magnitudo tingkat pertama yang paling terpencil.",
            "adalah bintang biru besar di rasi Orion. Bintang ini merupakan bintang tercerah ketigapuluh di langit malam dan merupakan bintang tercerah keempat di rasi ini. Sebagai bintang supraraksasa biru keputihan (blue-white supergiant), bintang ini juga termasuk bintang yang paling cemerlang. Bersama dengan Mintaka (Delta Orionis) dan Alnitak (Zeta Orionis), bintang ini membentuk \"ikat pinggang Orion\", yang sangat terkenal pada kebudayaan kuno. Bintang ini berada di tengah dari ketiga bintang tersebut.",
            "adalah bintang tercerah di rasi Cygnus. Bintang ini merupakan bintang tercerah kesembilanbelas di langit malam, dengan magnitudo 1.25. Sebagai bintang super raksasa, bintang ini juga termasuk bintang yang cemerlang di langit malam.",
            "adalah bintang tercerah di rasi bintang Aries. α Arietis adalah bintang dengan tipe K2IIICa-1, berarti bintang ini termasuk bintang raksasa bertipe K (K-type giant star), lebih dingin daripada Matahari dan lebih besar. Bintang ini memiliki diameter 15 kali lebih besar daripada Matahari, dan lebih cemerlang 90 kali Matahari[4]. α Arietis berada pada jarak 66 tahun cahaya dari Bumi. Bintang ini memiliki magnitudo sangat cemerlang, yaitu 0.48, sehingga termasuk bintang tercerah keempat puluh tujuh.",
            "adalah bintang katai merah yang terletak sejauh 4,2 tahun cahaya (3,97×10^13 km) dari Bumi. Bintang ini terletak di rasi bintang Centaurus. Proxima Centauri ditemukan pada tahun 1915 oleh Robert Innes, Direktur Observatorium Union di Afrika Selatan.",
            "adalah bintang tercerah kedua di rasi Leo. Bintang ini termasuk kelas A yang berada pada jarak 36 tahun cahaya dari Bumi, serta memiliki kecemerlangan 12 klai Matahari. Magnitudo Denebola adalah 2.14.",
            "adalah bintang raksasa jingga (orange giant) yang berada pada jarak 34 tahun cahaya dari Bumi, berada di rasi Gemini. Pollux termasuk bintang tercerah di langit malam, juga tercerah di rasi, jika dibandingkan dengan \"kembarannya\" (α Gem). Pada tahun 2006, Pollux dikonfirmasi memiliki planet.",
            "adalah bintang paling terang di rasi Leo dan termasuk bintang yang cemerlang di langit malam. Bintang ini berada pada jarak 77.5 tahun cahaya dari Bumi. Regulus merupakan sistem multi bintang yang terdiri dari empat bintang yang tergabung dalam dua pasang bintang. Regulus A terdiri dari bintang biru keputihan dan pasangannya yang belum diamati, berkemungkinan adalah bintang katai putih (white dwarf). Di depan Regulus A terdapat pasangannya yang terdiri dari Regulus B dan Regulus C, yang merupakan bintang redup.\n",
            "Procyon (pengucapan bahasa Inggris: ['proʊsɪən]) (α CMi / α Canis Minoris / Alpha Canis Minoris) adalah bintang paling terang di rasi Canis Minor. Dengan mata telanjang tampak sebagai bintang tunggal dengan magnitudo tampak 0,34. Procyon sebenarnya adalah sebuah sistem bintang ganda yang terdiri dari sebuah bintang deret utama dengan kelas spektrum F5 IV-V, dinamai Procyon A, dan sebuah katai putih dengan kelas spektrum DA yang dinamai Procyon B. Pada jarak 3,5 parsec atau 11,41 tahun cahaya, Procyon menjadi salah satu bintang tetangga Matahari. Tetangga terdekat Procyon adalah Bintang Luyten, pada jarak 0,34 pc atau 1,11 tahun cahaya.",
            ""
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
            R.drawable.alpha_centauri_a_and_b,
            R.drawable.altair,
            R.drawable.achernar,
            R.drawable.alnilam,
            R.drawable.deneb,
            R.drawable.hamal,
            R.drawable.proxima,
            R.drawable.denebola,
            R.drawable.pollux,
            R.drawable.regulus,
            R.drawable.procyon,
            R.drawable.alioth


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
