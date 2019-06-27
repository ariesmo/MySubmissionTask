package com.example.mysubmissiontask;

import java.util.ArrayList;

public class SubmissionData {
    public static String[][] data = new String[][]{
            {"Ikan Jelawat Panggang", "Ikan Jelawat Panggang. Tekstur dagingnya tebel, lembut, dan gak amis.", "https://upload.wikimedia.org/wikipedia/commons/9/98/Microsoft_logo.jpg","Jangan lupa makan kandas dengan IKAN JELAWAT PANGGANG. Tekstur dagingnya tebel, lembut, dan gak amis. Ikan jelawat adalah ikan air tawar, jadi hati2 ya foodlovers saat makannya nanti, soalnya ada banyak durinya. Jangan lupa tambah nasi putih biar makan foodlovers semakin puas!  . . Harga: IKAN JELAWAT PANGGANG 30k/porsi Lokasi: KULINER TEMPO DOELOE \"SERBA KANDAS\" (Jl. Sanggabuana 2 no.41, Palangka Raya, Kalimantan Tengah)"},
            {"Ikan Seluang Goreng", "Ikan seluang krispi merupakan suatu jenis masakan lauk-pauk yang menggunakan ikan seluang", "https://upload.wikimedia.org/wikipedia/commons/9/94/Logo_oracle.jpg", "Ikan Seluang Krispi Enak dan Lezat. Ikan seluang krispi merupakan suatu jenis masakan lauk-pauk yang menggunakan ikan seluang kemudian digoreng hingga krispi dengan tambahan bumbu agar menghasilkan ikan goreng yang lezat pula"},
            {"Ikan Toman Masak Kuning", "Ikan toman merupakan suatu jenis masakan lauk-pauk yang menggunakan ikan toman", "https://upload.wikimedia.org/wikipedia/commons/7/7c/SAP_Business_Information_Warehouse_%28SAP_BW%29.png","Ikan toman adalah ikan air tawar yang hiduo di air tawar, rawa, dah sungai gambut. Ikan ini merupakan ikan predator, walaupun ikan ini predator ikan ini sangat enak jika di masak dengan santan dan bumbu kuning, bisanya juga di jadikan masak merah(masak habang) untuk menemani nasi kuning dan lontong santan sayur"},
            {"Ikan Lais Goreng", "Ikan Lais krispi merupakan suatu jenis masakan lauk-pauk yang menggunakan ikan lais", "https://upload.wikimedia.org/wikipedia/commons/e/e8/Norton_Logo.jpg", "Ikan Lais adalah jenis ikan air tawar atau sungai yang banyak ditemukan di perairan Kalimantan. Ikan lais ini merupakan ikan endemik yang memiliki nilai ekonomis tinggi yang bersifat sebagai ikan konsumsi terutama bila telah diolah menjadi selai ikan lais (smoked fish). Belakangan ini, produksi selai ikan lais juga sudah mulai diekspor ke negara Malaysia. Ikan Lais memiliki manfaat yang bagus untuk kesehatan. Di dalam tubuh ikan ini ditemukan vitamin dan mineral yang sangat baik bila dicerna oleh manusia. Kandungan kalsium ikan lais juga tinggi sehingga bisa mampu mencegah berbagai macam penyakit tulang dan gigi."},
            {"Ikan Kapar Goreng", "Ikan kapar krispi merupakan suatu jenis masakan lauk-pauk yang menggunakan ikan kapar", "https://upload.wikimedia.org/wikipedia/commons/0/01/CA_r_1c_Black_2014-transparent.png","Ikan Kapar (Belongtia hasseltii), adalah sejenis ikan dari suku gurami-guramian (Osphronemidae). Ikan ini juga dikenal dengan nama-nama lain seperti Kakapar, Kopar, Selincah (Bahasa Melayu Sumatera dan Kalimantan), Kumpang (Kalbar) atau Ketoprak, tambakan (dialek Betawi). Di Tempat saya sendiri di Palangka Raya kami menyebutnya ikan Kapar atau ikan Kakapar. Ikan ini terutama banyak hidup di perairan gambut. Ikan ini biasa dikonsumsi secara lokal dan belakangan juga diperdagangkan sebagai ikan hias di beberapa daerah"},
            {"Sambal Kandas Rua", "Bahan baku bumbunya adalah SINGKAH Rua Dan Terong Asam", "https://upload.wikimedia.org/wikipedia/commons/2/25/VMware_Fusion_v4.0_icon.png", "Kandas SINGKAH RUA+TERONG ASAM yang paling unik di anatara kandas lain, karena bahan bakunya dari Singkah Rua yang berarti Rotan. Biasanya kita familiar dengan rebung yg berasal dari bambu. Ternyata rotan juga bisa dimakan loh foodlovers. Dibikin sambal juga nikmat loohh  . . Harga: KANDAS SINGKAH RUA+TERONG ASAM 15k/porsi Lokasi: KULINER TEMPO DOELOE \"SERBA KANDAS\" (Jl. Sanggabuana 2 no.41, Palangka Raya, Kalimantan Tengah)"},
            {"Sambal Kandas Terong Pipit", "Sekilas mirip sambal leunca (kalau di Tanah Sunda). Bentuknya sama kecil, bulat, hijau", "https://upload.wikimedia.org/wikipedia/commons/f/f4/Adobe_Partnership.jpg","Kandas TERONG PIPIT sekilas mirip sambal leunca (kalau di Tanah Sunda). Bentuknya sama kecil, bulat, hijau. Bedanya lulit terong pipit lebih tebal. Jadi, ada sedikit rasa pahit. Tapi, karena dicampur pake ikan patin, pahitnya jd gak terlalu berasa kok. Malah jadi sedaap. . . Harga: KANDAS TERONG PIPIT 10k/porsi Lokasi: KULINER TEMPO DOELOE \"SERBA KANDAS\" (Jl. Sanggabuana 2 no.41, Palangka Raya, Kalimantan Tengah)"}
    };

    public static ArrayList<Submission> getListData(){
        Submission submission = null;
        ArrayList<Submission> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++){
            submission = new Submission();
            submission.setNama(data[i][0]);
            submission.setKeterangan(data[i][1]);
            submission.setFoto(data[i][2]);
            submission.setDetail(data[i][3]);
            list.add(submission);
        }
        return list;
    }
}
