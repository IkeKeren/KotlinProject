package com.example.mytripapps

object TripData {
    private val tripName = arrayOf("Candi Borobudur (Jawa Tengah)",
        "Gili Tarawang (NTB)",
        "Gunung Bromo (Jawa Timur)",
        "Gunung Rinjani (NTB)",
        "Nusa Dua Bali (Bali)",
        "Pantai Parai Tenggiri (Bangka Belitung)",
        "Pulau Komodo ( NTT)",
        "Pura Besakih (Bali)",
        "Kepulauan Raja Ampat (Papua Barat)",
        "Tana Toraja (Sulawesi Selatan)")

    private val tripDetails = arrayOf(
        "Salah satu ikon wisata budaya Indonesia yang mendunia lainnya adalah Candi Borobudur. Sebagai candi Budha terbesar di dunia dengan luas tak kurang dari 123 X 123 meter, candi yang dibangun pada masa kerajaan Mataram kuno ini merupakan warisan budaya dan sejarah Indonesia yang terkenal akan arsitektur yang memukau.\n" +
                "\n" +
                "Setiap tahunnya, tak cuma wisatawan domestik tetapi banyak juga wisatawan asing yang tertarik untuk mengamati keindahan dari Candi Borobudur.\n" +
                "\n" +
                "Berbagai relief yang menceritakan mengenai berbagai ajaran dalam agama Budha dan perjalanan hidup Sidharta Gautama hingga mencapai pencerahan sempurna bisa Toppers temukan di tempat wisata favorit asal Indonesia.\n" +
                "\n" +
                "Candi Borobudur sendiri memiliki total tak kurang dari 504 arca Buddha dan 2.672 panel relief pada dinding-dindingnya. Menakjubkan sekali, bukan?",
        "Untuk pecinta pantai, Gili Trawangan merupakan tujuan wisatawan dari seluruh dunia. Dengan kombinasi langit biru dengan semburat awan putih, jernihnya air laut dibingkai pasir putih menjadikan Gili Trawangan sebagai tujuan wisata populer baik bagi wisatawan dalam negeri maupun luar negeri.\n" +
                "\n" +
                "Selain pantai dan alam bawah laut, tempat wisata Nusantara yang berada di Provinsi Nusa Tenggara Barat ini juga memiliki berbagai lansekap menakjubkan dan juga spot-spot foto yang instagramable, lho.",
        "Kalau kamu pernah berkunjung ke Jawa Timur gak lengkap rasanya kalau belum menginjakkan kaki ke Gunung Bromo ini.\n" +
                "\n" +
                "Salah satu gunung berapi yang masih aktif ini memiliki pesona khas berupa gurun pasir yang sangat luat.\n" +
                "\n" +
                "Meskipun bukan salah satu gunung tertinggi di Indonesia, namun keindahan Gunung Bromo tidak ada duanya dan membuat para pengunjung dapat merasakan pemandangan yang fantastis dan spektakuler.\n" +
                "\n" +
                "Wisatawan dapat berkuda dan mendaki gunung bromo untuk menikmati keindahan yang menawan saat matahari terbit dan terbenam.\n" +
                "\n" +
                "Bisa jadi pengalaman secara langsung yang tidak terlupakan lho Toppers! Dengan keindahan yang menakjubkan itu tidak heran jika objek wisata di Indonesia satu ini menjadi para wisatawan mancanegara yang berkunjung ke Indonesia.",
        "Selain Gili Trawangan, di Nusa Tenggara Barat juga terdapat wisata yang tak kalah populer dan cocok bagi kamu yang suka mendaki, yakni Gunung Rinjani. Gunung ini adalah gunung berapi tertinggi kedua yang ada di Indonesia. \n" +
                "\n" +
                "Gunung Rinjani memiliki pemandangan terindah se-Asia dengan hamparan bunga edelweis dan Danau Segara Anak. Di tempat ini juga bisa menjadi spot menarik bagi para pendaki untuk mendirikan tenda, mandi air hangat, maupun memancing ikan. \n" +
                "\n" +
                "Namun sebelum itu, buatlah persiapan yang matang sebelum memutuskan untuk mendaki. Kamu juga perlu menyiapkan bekal mental dan stamina agar tidak menyerah di tengah jalan.",
        "Pulau Seribu Dewa satu ini memang tidak perlu diragukan lagi terkait keindahan dan pesonanya dalam memikat para wisatawan dalam negeri maupun mancanegara. Di Bali, ada satu tempat wisata yang begitu cantik, yakni Nusa Dua. \n" +
                "\n" +
                "Objek wisata pantai ini memiliki pasir putih yang lembut dan air laut yang berwarna biru jernih. Kamu akan dimanjakan dengan berbagai fasilitas saat berkunjung ke tempat satu ini. Mulai dari penginapan dan resort yang berkelas, restoran, pusat perbelanjaan, hingga aktivitas berselancar di pantainya.",
        "Pasti diantara kamu sudah pernah menyaksikan film populer Laskar Pelangi yang berlatar di Pulang Belitung, bukan? Selain alur ceritanya yang menarik, lokasi film ini juga banyak menyita perhatian penonton. \n" +
                "\n" +
                "Berbeda dengan pantai lain pada umumnya, Parai Tenggiri memiliki struktur pantai yang landai dengan air laut berwarna hijau toska serta pasir putihnya yang lembut. Ombak di pantai ini juga tenang sehingga menjadi salah satu alasan yang menarik bagi wisatawan yang senang berenang. \n" +
                "\n" +
                "Tidak hanya berenang, kamu juga bisa menikmati aktivitas memancing, parasailing, menyelam, snorkeling, dan masih banyak lainnya.",
        "Destinasi wisata Indonesia yang tersohor di mata dunia selanjutnya adalah Pulau Komodo. Pulau yang berlokasi di Kepulauan Nusa Tenggara Timur ini merupakan rumah bagi ratusan Komodo, hewan endemik yang hanya ada di Indonesia.\n" +
                "\n" +
                "Selain bisa mengamati perilaku dan mengeksplorasi habitat dari hewan purba ini, Pulau Komodo juga menawarkan panorama alam yang menakjubkan.\n" +
                "\n" +
                "Salah satunya adalah pantai dengan pasir berwarna merah muda yang dikenal dengan nama “Pink Beach“.\n" +
                "\n" +
                "Pantai seperti ini hanya terdapat tujuh di seluruh dunia sehingga menjadikannya sebagai salah satu tujuan wisata Indonesia yang mendunia.",
        "Pura Agung Besakih adalah pura terbesar dan termegah di Bali. Pulau ini terletak di Desa Besakih, Kecamatan Rendang, berada di lereng sebelah barat daya Gunung Agung, gunung tertinggi di Bali.\n" +
                "\n" +
                "Pura Agung Besakih memiliki gaya arsitektur yang mengagumkan khas Bali dan berada di ketinggian 915 kaki di kaki Gunung Agung dengan memukau. Bangunan yang dibangun sejak abad ke-10 Masehi ini menjadi pusat kegiatan spiritual Hindu Dharma di Pulau Dewata.\n" +
                "\n" +
                "Dengan segala fitur yang dimiliki Pura Besakih, tidak aneh jika situs ini ditetapkan sebagai Situs Warisan Budaya UNESCO sejak selamat dari erupsi Gunung Agung pada tahun 1963.\n" +
                "\n" +
                "Akses dari Kota Denpasar untuk mencapai tempat ini berjarak sekitar 25 km ke arah utara dari Kota Semarapura, Kabupaten Klungkung. Perjalanan menuju Pura Besakih melewati panorama Bukit Jambul yang juga merupakan salah satu obyek dan daya tarik wisata Kabupaten Karangasem.",
        "Surga dunia di Indonesia selanjutnya adalah kepulauan Raja Ampat yang terletak di Papua Barat dengan kekayaan laut terlengkap di bumi.\n" +
                "\n" +
                "Raja Ampat atau Empat Raja merupakan 4 pulau indah yang merupakan penghasil lukisan batu kuno. Empat pulau utama yang dimaksud adalah Waigeo, Salawati, Batanta, dan Misool.\n" +
                "\n" +
                "Nama-nama tersebut berasal dari mitos lokal dari warga di sekitar pulau Raja Ampat. Keindahan dan kemegahan dari objek wisata populer asal Indonesia ini mampu mengundang para wisatawan dari seluruh dunia untuk datang ke sini dan merasakan pengalaman sekaligus pemandangan yang tidak akan terlupakan.\n" +
                "\n" +
                "Dengan wilayah pulau mencakup hingga 4,6 juta hektar tanah dan laut, kita bisa menemukan 540 jenis karang, 1.511 spesies ikan, serta 700 jenis moluska.\n" +
                "\n" +
                "Perlu diketahui Toppers, menurut laporan The Nature Conservancy and Conservation International, ada sekitar 75% spesies laut dunia yang tinggal di pulau indah nan menakjubkan ini.",
        "Indonesia memang kaya akan adat dan budaya yang menarik mata dunia. Salah satu destinasi wisata Indonesia yang terkenal akan kekayaan tradisi budayanya adalah  Kabupaten Tana Toraja.\n" +
                "\n" +
                "Terletak di Sulawesi Selatan dikawasan pegunungan yang indah, Toppers masih bisa melihat uniknya keseharian dan tradisi masyarakat adat Tana Toraja.\n" +
                "\n" +
                "Selain keindahan arsitektur tradisional rumah tongkonan, wisatawan juga bisa mengamati tradisi unik upacara kematian yang dikenal sebagai Rambu Solo yang biasanya diselenggarakan pada Juli dan Agustus\n" +
                "\n" +
                "Keunikan dari tradisi ini menjadikan Tana Toraja sebagai tempat wisata asal Indonesia yang memiliki daya tarik mendunia.")

    private val tripImages = intArrayOf(R.drawable.candi_borobudur,
        R.drawable.gili_tarawang,
        R.drawable.gunung_bromo,
        R.drawable.gunung_rinjani,
        R.drawable.nusadua_bali,
        R.drawable.pantai_paratenggiri,
        R.drawable.pulau_komodo,
        R.drawable.pura_besakih,
        R.drawable.raja_ampat,
        R.drawable.tana_toraja)

    val listData: ArrayList<Trip>
        get() {
            val list = arrayListOf<Trip>()
            for (position in tripName.indices) {
                val trip = Trip()
                trip.name = tripName[position]
                trip.detail = tripDetails[position]
                trip.photo = tripImages[position]
                list.add(trip)
            }
            return list
        }

}