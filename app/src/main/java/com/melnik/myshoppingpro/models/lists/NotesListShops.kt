package com.melnik.myshoppingpro.models.lists

import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.models.Shops
import com.melnik.myshoppingpro.ui.App
import com.melnik.myshoppingpro.utils.*

fun getAppliancesShops() = arrayListOf(
	Pair(Shops(0, "590.UA", FNZ_RAT, false, App.instance.getString(R.string.id_1), FNZ, R.drawable.pdn),false),
	Pair(Shops(1, "Comfy", COMFY_RAT, false, App.instance.getString(R.string.id_2), COMFY, R.drawable.comfy),false),
	Pair(Shops(2, "Vencon", VENCON_RAT, false, App.instance.getString(R.string.id_3), VENCON, R.drawable.vencon),false),
	Pair(Shops(3, "Moyo", MOYO_RAT, false, App.instance.getString(R.string.id_4), MOYO, R.drawable.moyo),false),
	Pair(Shops(4, "Q-Techno", Q_TECHNO_RAT, false, App.instance.getString(R.string.id_5), Q_TECHNO, R.drawable.qtechno),false),
	Pair(Shops(5, "Stylus", STYLUS_RAT, false, App.instance.getString(R.string.id_6), STYLUS, R.drawable.stylus),false),
	Pair(Shops(6, "Rozetka", ROZETKA_RAT,false, App.instance.getString(R.string.id_7), ROZETKA, R.drawable.rozetka),false),
	Pair(Shops(7, "Eldorado", ELDORADO_RAT, false, App.instance.getString(R.string.id_8), ELDORADO, R.drawable.eldorado2),false),
	Pair(Shops(8, "Foxtrot", FOXTROT_RAT, false, App.instance.getString(R.string.id_9), FOXTROT, R.drawable.foxtrot),false),
	Pair(Shops(9, "Epicentr", EPICENTR_RAT, false, App.instance.getString(R.string.id_10), EPICENTR, R.drawable.epicentr),false),
	Pair(Shops(10, "Allo", ALLO_RAT, false, App.instance.getString(R.string.id_233), ALLO, R.drawable.allo),false)
)

fun getCompAndElectrShops() = arrayListOf(
	Pair(Shops(1, "Comfy", COMFY_RAT, false, App.instance.getString(R.string.id_2), COMFY,R.drawable.comfy),false),
	Pair(Shops(3, "Moyo", MOYO_RAT, false, App.instance.getString(R.string.id_4), MOYO,R.drawable.moyo),false),
	Pair(Shops(4, "Q-Techno", Q_TECHNO_RAT, false, App.instance.getString(R.string.id_5), Q_TECHNO, R.drawable.qtechno),false),
	Pair(Shops(5, "Stylus", STYLUS_RAT, false, App.instance.getString(R.string.id_6), STYLUS, R.drawable.stylus),false),
	Pair(Shops(7, "Telemart", TELEMART_RAT, false, App.instance.getString(R.string.id_11), TELEMART, R.drawable.telemart),false),
	Pair(Shops(308, "SolPower", SOLPOWER_RAT, false, App.instance.getString(R.string.id_310), SOLPOWER, R.drawable.solpower),false),
	Pair(Shops(309, "Сетевуха", SETEVUHA_RAT, false, App.instance.getString(R.string.id_311), SETEVUHA, R.drawable.setevuha),false),
	Pair(Shops(310, "FotoPapir", FOTOPAPIR_RAT, false, App.instance.getString(R.string.id_312), FOTOPAPIR, R.drawable.fotopapir),false),
	Pair(Shops(311, "Bezpeka-Shop", BEZPECA_RAT, false, App.instance.getString(R.string.id_313), BEZPECA, R.drawable.bezpeka),false),
	Pair(Shops(312, "Up2date", UPTDATE_RAT, false, App.instance.getString(R.string.id_314), UPTDATE, R.drawable.up2date),false),
	Pair(Shops(313, "Topsmart", TOPSMART_RAT, false, App.instance.getString(R.string.id_315), TOPSMART, R.drawable.topsmart),false)
)

fun getSmartphonesAndPhones() = arrayListOf(
	Pair(Shops(1, "Comfy", COMFY_RAT, false, App.instance.getString(R.string.id_2), COMFY, R.drawable.comfy),false),
	Pair(Shops(3, "Moyo", MOYO_RAT, false, App.instance.getString(R.string.id_4), MOYO, R.drawable.moyo),false),
	Pair(Shops(4, "Q-Techno", Q_TECHNO_RAT, false, App.instance.getString(R.string.id_5), Q_TECHNO, R.drawable.qtechno),false),
	Pair(Shops(5, "Stylus", STYLUS_RAT, false, App.instance.getString(R.string.id_6), STYLUS, R.drawable.stylus),false),
	Pair(Shops(10, "Allo", ALLO_RAT, false, App.instance.getString(R.string.id_233), ALLO, R.drawable.allo),false),
	Pair(Shops(6, "Rozetka", ROZETKA_RAT, false, App.instance.getString(R.string.id_7), ROZETKA, R.drawable.rozetka),false),
	Pair(Shops(314, "iStore", ISTOR_RAT, false, App.instance.getString(R.string.id_316), ISTOR, R.drawable.istore),false),
	Pair(Shops(315, "Цитрус", CITRUS_RAT, false, App.instance.getString(R.string.id_317), CITRUS, R.drawable.citrus),false),
	Pair(Shops(316, "Toiler", TOILER_RAT, false, App.instance.getString(R.string.id_318), TOILER, R.drawable.toiler),false),
	Pair(Shops(317, "Easybay", EASYBAY_RAT, false, App.instance.getString(R.string.id_319), EASYBAY, R.drawable.easybay),false)
)

fun getConstructionAndRenovation() = arrayListOf(
	Pair(Shops(11, "VENBUD", VENBUD_RAT, false, App.instance.getString(R.string.id_12), VENBUD, R.drawable.venbud),false),
	Pair(Shops(2, "Vencon", VENCON_RAT, false, App.instance.getString(R.string.id_3), VENCON, R.drawable.vencon),false),
	Pair(Shops(1, "Comfy", COMFY_RAT, false, App.instance.getString(R.string.id_2), COMFY, R.drawable.comfy),false),
	Pair(Shops(3, "Moyo", MOYO_RAT, false, App.instance.getString(R.string.id_4), MOYO, R.drawable.moyo),false),
	Pair(Shops(226, "Keramis", KERAMIS_RAT, false, App.instance.getString(R.string.id_227), KERAMIS, R.drawable.keramis),false),
	Pair(Shops(227, "Кулибин", KULIBIN_RAT, false, App.instance.getString(R.string.id_228), KULIBIN, R.drawable.kulibin),false),
	Pair(Shops(228, "Oboistyle", OBOISTYLE_RAT, false, App.instance.getString(R.string.id_229), OBOISTYLE, R.drawable.oboistyle),false),
	Pair(Shops(229, "СтройМаг", STROIMAG_RAT, false, App.instance.getString(R.string.id_230), STROIMAG, R.drawable.strojmag),false),
	Pair(Shops(318, "JM", JM_RAT, false, App.instance.getString(R.string.id_320), JM, R.drawable.jm),false),
	Pair(Shops(319, "Супермаркет Фитингов", FITTING_RAT, false, App.instance.getString(R.string.id_321), FITTING, R.drawable.fitting),false)
)

fun getDesignAndDecor() = arrayListOf(
	Pair(Shops(12, "BULB", BULB_RAT, false, App.instance.getString(R.string.id_13), BULB, R.drawable.bulb),false),
	Pair(Shops(13, "Арт-Обои", ART_OBOI_RAT, false, App.instance.getString(R.string.id_14), ART_OBOI, R.drawable.artoboi),false),
	Pair(Shops(14, "Icon-Store", ICON_STORE_RAT,false, App.instance.getString(R.string.id_15), ICON_STORE, R.drawable.icon_store),false),
	Pair(Shops(15, "Niltex", NILTEX_RAT, false, App.instance.getString(R.string.id_16), NILTEX, R.drawable.niltex),false),
	Pair(Shops(16, "Мир пола и Декора", MIR_POLA_RAT, false, App.instance.getString(R.string.id_17), MIR_POLA, R.drawable.mirpola),false),
	Pair(Shops(230, "Транс Стоун", TRANS_STORE_RAT, false, App.instance.getString(R.string.id_231), TRANS_STORE, R.drawable.transstore2),false),
	Pair(Shops(231, "Шедевр", ELLITE_PAINT_RAT, false, App.instance.getString(R.string.id_232), ELLITE_PAINT, R.drawable.ellite2),false),
	Pair(Shops(320, "Декоратор", DECORSHOP_RAT, false, App.instance.getString(R.string.id_322), DECORSHOP, R.drawable.decorshop),false),
	Pair(Shops(321, "JYSK", JYSK_RAT, false, App.instance.getString(R.string.id_323), JYSK, R.drawable.jysk),false),
	Pair(Shops(322, "Ярмарок Декору", YAR_DECOR_RAT, false, App.instance.getString(R.string.id_324), YAR_DECOR, R.drawable.yardec),false)
)

fun getGardenAndVegetable() = arrayListOf(
	Pair(Shops(17, "Sad-ogorod", SAD_OGOROD_RAT,false, App.instance.getString(R.string.id_18), SAD_OGOROD, R.drawable.sadogorod),false),
	Pair(Shops(18, "С Торгом", S_TORGOM_RAT, false, App.instance.getString(R.string.id_19), S_TORGOM, R.drawable.storgrom),false),
	Pair(Shops(1, "Comfy", COMFY_RAT, false, App.instance.getString(R.string.id_2), COMFY, R.drawable.comfy),false),
	Pair(Shops(3, "Moyo", MOYO_RAT, false, App.instance.getString(R.string.id_4), MOYO4, R.drawable.moyo),false),
	Pair(Shops(19, "GreenMarket",	GREENMARKET_RAT, false, App.instance.getString(R.string.id_20), GREENMARKET, R.drawable.greenmarket),false),
	Pair(Shops(20, "Семена почтой", SEMENA_RAT, false, App.instance.getString(R.string.id_21), SEMENA, R.drawable.sempochta),false),
	Pair(Shops(21, "Огород", OGOROD_RAT, false, App.instance.getString(R.string.id_22), OGOROD, R.drawable.ogorod),false),
	Pair(Shops(22, "Флориум", FLORIUM_RAT, false, App.instance.getString(R.string.id_23), FLORIUM, R.drawable.florium),false),
	Pair(Shops(23, "In-green", IN_GREEN_RAT, false, App.instance.getString(R.string.id_24), IN_GREEN, R.drawable.ingreen),false),
	Pair(Shops(323, "Зернятно", ZERNO_RAT, false, App.instance.getString(R.string.id_325), ZERNO, R.drawable.zerno),false)
)
fun getFurniture() = arrayListOf(
	Pair(Shops(24, "Дубок", DYBOK_RAT, false, App.instance.getString(R.string.id_25), DYBOK, R.drawable.dybok),false),
	Pair(Shops(25, "Домотека", DOMOTEKA_RAT, false, App.instance.getString(R.string.id_26), DOMOTEKA, R.drawable.domoteka),false),
	Pair(Shops(26, "Шопомаг", SHOPOMAG_RAT, false, App.instance.getString(R.string.id_27), SHOPOMAG, R.drawable.shopomag),false),
	Pair(Shops(27, "Мебель-Бум", MEBEL_BUM_RAT, false, App.instance.getString(R.string.id_28), MEBEL_BUM, R.drawable.mebelboom),false),
	Pair(Shops(28, "Файні Меблі",	FANI_MEBEL_RAT,	false, App.instance.getString(R.string.id_29), FANI_MEBEL, R.drawable.faynimebli),false),
	Pair(Shops(29, "Мебельная Планета", MEBEL_PLANET_RAT, false, App.instance.getString(R.string.id_30), MEBEL_PLANET, R.drawable.planetamebeli),false),
	Pair(Shops(30, "MaxMebel", MAX_MEBEL_RAT, false, App.instance.getString(R.string.id_31), MAX_MEBEL, R.drawable.maxmebel),false),
	Pair(Shops(324, "МЕБЛИУМ", MEBLIUM_RAT, false, App.instance.getString(R.string.id_326), MEBLIUM, R.drawable.meblium),false),
	Pair(Shops(325, "КупиСтул", K_STUL_RAT, false, App.instance.getString(R.string.id_327), K_STUL, R.drawable.kupistul),false),
	Pair(Shops(326, "Шуруп", SHURUP_RAT, false, App.instance.getString(R.string.id_328), SHURUP, R.drawable.shurup),false)
)
fun getHouseholdProducts() = arrayListOf(
	Pair(Shops(31, "Подушка", PODYSHKA_RAT, false, App.instance.getString(R.string.id_32), PODYSHKA, R.drawable.podushka),false),
	Pair(Shops(32, "Lampa", LAMPA_RAT, false, App.instance.getString(R.string.id_33), LAMPA, R.drawable.lampa),false),
	Pair(Shops(33, "Экоист", ECOIST_RAT, false, App.instance.getString(R.string.id_34), ECOIST, R.drawable.ecoistlogo),false),
	Pair(Shops(34, "Хоздом", HOZDOM_RAT, false, App.instance.getString(R.string.id_35), HOZDOM, R.drawable.hozdom),false),
	Pair(Shops(35, "Shkura", SHKYRA_RAT, false, App.instance.getString(R.string.id_36), SHKYRA, R.drawable.shkura),false),
	Pair(Shops(36, "Elekomp", ELECOMP_RAT, false, App.instance.getString(R.string.id_37), ELECOMP, R.drawable.elekomp),false),
	Pair(Shops(37, "Эдем - Текстиль", EDEM_RAT, false, App.instance.getString(R.string.id_38), EDEM, R.drawable.edemtextile),false),
	Pair(Shops(38, "Dormeo", DORMEO_RAT, false, App.instance.getString(R.string.id_39), DORMEO, R.drawable.dormeo),false),
	Pair(Shops(327, "BUY and SLEEP", BUY_SLEEP_RAT, false, App.instance.getString(R.string.id_329), BUY_SLEEP, R.drawable.buysleep),false),
	Pair(Shops(328, "Азбука сна", AZSNA_RAT, false, App.instance.getString(R.string.id_330), AZSNA, R.drawable.azsna),false)
)
fun getOfficeSupplies() = arrayListOf(
	Pair(Shops(232, "Юканц", UCANC_GROUP_RAT, false, App.instance.getString(R.string.id_234), UCANC_GROUP,R.drawable.ucancgroup), false),
	Pair(Shops(233, "СНПЧ INKSYSTEM", INK_SYSTEM_RAT, false, App.instance.getString(R.string.id_235), INK_SYSTEM,R.drawable.inksystem), false),
	Pair(Shops(234, "OfficeTime", OFFICE_TIME_RAT, false, App.instance.getString(R.string.id_236), OFFICE_TIME,R.drawable.officetime), false),
	Pair(Shops(235, "Папирус", PAPIRUS_RAT, false, App.instance.getString(R.string.id_237), PAPIRUS,R.drawable.papirus), false),
	Pair(Shops(236, "kanc.org", KANC_ORG_RAT, false, App.instance.getString(R.string.id_238), KANC_ORG,R.drawable.kancorg), false),
	Pair(Shops(237, "Aragon", ARAGON_RAT, false, App.instance.getString(R.string.id_239), ARAGON,R.drawable.aragon), false),
	Pair(Shops(238, "Камертон", KAMERTON_RAT, false, App.instance.getString(R.string.id_240), KAMERTON,R.drawable.kamertonn), false),
	Pair(Shops(239, "Палей", PALEY_RAT, false, App.instance.getString(R.string.id_241), PALEY,R.drawable.paley), false),
	Pair(Shops(240, "КанцКапитал", KANCKAPITAL_RAT, false, App.instance.getString(R.string.id_242), KANCKAPITAL,R.drawable.kanckapital), false),
	Pair(Shops(241, "Accent-Service", AKSERVIS_RAT, false, App.instance.getString(R.string.id_243), AKSERVIS,R.drawable.akservis), false)
)
fun getClothes() = arrayListOf(
	Pair(Shops(39, "Laluna", LALUNA_RAT, false, App.instance.getString(R.string.id_40), LALUNA, R.drawable.laluna),false),
	Pair(Shops(40, "Trendy - Image", TRENDY_RAT, false, App.instance.getString(R.string.id_41), TRENDY, R.drawable.trendyimage),false),
	Pair(Shops(41, "Марафон", MARAFON_RAT, false, App.instance.getString(R.string.id_42), MARAFON, R.drawable.marathon),false),
	Pair(Shops(42, "MamaCity", MAMACYTY_RAT, false, App.instance.getString(R.string.id_43), MAMACYTY, R.drawable.mamacity),false),
	Pair(Shops(43, "MODOZA", MODOZA_RAT, false, App.instance.getString(R.string.id_44), MODOZA, R.drawable.modoza),false),
	Pair(Shops(44, "Остров", OSTRIV_RAT, false, App.instance.getString(R.string.id_45), OSTRIV, R.drawable.ostriv),false),
	Pair(Shops(45, "SUNDUK", SUNDUK_RAT, false, App.instance.getString(R.string.id_46), SUNDUK, R.drawable.sunduk),false),
	Pair(Shops(46, "TopOk", TOPOK_RAT, false, App.instance.getString(R.string.id_47), TOPOK, R.drawable.topok),false),
	Pair(Shops(329, "Глазурь", GLAZUR_RAT, false, App.instance.getString(R.string.id_331), GLAZUR, R.drawable.glazur),false),
	Pair(Shops(330, "MMA Style", MMA_RAT, false, App.instance.getString(R.string.id_332), MMA, R.drawable.mma),false)
)
fun getShoes() = arrayListOf(
	Pair(Shops(47, "Sniker", SNIKER_RAT, false, App.instance.getString(R.string.id_48), SNIKER, R.drawable.sniker),false),
	Pair(Shops(48, "nanogu", NANOGU_RAT, false, App.instance.getString(R.string.id_49), NANOGU, R.drawable.nanogu),false),
	Pair(Shops(49, "Nubuck", NUBUK_RAT, false, App.instance.getString(R.string.id_50), NUBUK, R.drawable.nubuck),false),
	Pair(Shops(50, "Midashop", MIDA_RAT, false, App.instance.getString(R.string.id_51), MIDA, R.drawable.midashop),false),
	Pair(Shops(51, "PUMA", PUMA_RAT, false, App.instance.getString(R.string.id_52), PUMA, R.drawable.puma),false),
	Pair(Shops(52, "Kedoff.net", KEDOFF_RAT, false, App.instance.getString(R.string.id_53), KEDOFF, R.drawable.kedoff),false),
	Pair(Shops(44, "Остров", OSTRIV_RAT, false, App.instance.getString(R.string.id_45), OSTRIV, R.drawable.ostriv),false),
	Pair(Shops(43, "MODOZA", MODOZA_RAT, false, App.instance.getString(R.string.id_44), MODOZA, R.drawable.modoza),false),
	Pair(Shops(53, "NV Brand", NVBRAND_RAT, false, App.instance.getString(R.string.id_54), NVBRAND, R.drawable.nvbrandtop),false),
	Pair(Shops(331, "МИР ОБУВИ", MIR_OBUVI_RAT, false, App.instance.getString(R.string.id_333), MIR_OBUVI, R.drawable.mirobuvi),false)
)
fun getUnderwear() = arrayListOf(
	Pair(Shops(242, "Florange",  FLORANGE_RAT, false, App.instance.getString(R.string.id_244),  FLORANGE, R.drawable.florangeshop), false),
	Pair(Shops(243, "ASTRATEX", ASTRATEX_RAT, false, App.instance.getString(R.string.id_245), ASTRATEX, R.drawable.astratex), false),
	Pair(Shops(244, "Vivid", VIVID_RAT, false, App.instance.getString(R.string.id_246), VIVID, R.drawable.vivid), false),
	Pair(Shops(245, "Білизна", BELIZNA_RAT, false, App.instance.getString(R.string.id_247), BELIZNA, R.drawable.belizna), false),
	Pair(Shops(246, "Mari-M", MARIM_RAT, false, App.instance.getString(R.string.id_248), MARIM, R.drawable.marim), false),
	Pair(Shops(247, "Atlantic", ATLANTIC_RAT, false, App.instance.getString(R.string.id_249), ATLANTIC, R.drawable.atlantic), false),
	Pair(Shops(248, "069", ZSN_RAT, false, App.instance.getString(R.string.id_250), ZSN, R.drawable.zsn), false),
	Pair(Shops(249, "Алиса", ALISA_RAT, false, App.instance.getString(R.string.id_251), ALISA, R.drawable.alisa), false),
	Pair(Shops(250, "Darin", DARIN_RAT, false, App.instance.getString(R.string.id_252), DARIN, R.drawable.darin), false),
	Pair(Shops(251, "Lanett", LANET_RAT, false, App.instance.getString(R.string.id_253), LANET, R.drawable.lanet), false),
)

fun getBabyProducts() = arrayListOf(
	Pair(Shops(54, "Raspashonka",	RASPASHONKA_RAT, false, App.instance.getString(R.string.id_55), RASPASHONKA, R.drawable.raspashonka),false),
	Pair(Shops(55, "Дисней", DISNEY_RAT, false, App.instance.getString(R.string.id_56), DISNEY, R.drawable.disnej),false),
	Pair(Shops(56, "Pampik", PAMPIK_RAT, false, App.instance.getString(R.string.id_57), PAMPIK, R.drawable.pampik),false),
	Pair(Shops(57, "Чикко", CHICO_RAT, false, App.instance.getString(R.string.id_58), CHICO, R.drawable.chicco),false),
	Pair(Shops(58, "eBabyDay", EBABY_RAT, false, App.instance.getString(R.string.id_59), EBABY, R.drawable.ebabyday),false),
	Pair(Shops(59, "Shop - Mamka", MAMKA_RAT, false, App.instance.getString(R.string.id_60), MAMKA, R.drawable.shopmamka),false),
	Pair(Shops(60, "BABYSHOP", BABYSHOP_RAT, false, App.instance.getString(R.string.id_61), BABYSHOP, R.drawable.babyshop),false),
	Pair(Shops(61, "Lolo", LOLO_RAT, false, App.instance.getString(R.string.id_62), LOLO, R.drawable.lolo),false),
	Pair(Shops(62, "Малышам", MALISHAM_RAT, false, App.instance.getString(R.string.id_63), MALISHAM, R.drawable.malishamkiev),false),
	Pair(Shops(332, "Симпатяшка", SIMPATYSHKA_RAT, false, App.instance.getString(R.string.id_334), SIMPATYSHKA, R.drawable.simpatyshka),false)
)

fun getChildrenClothingAndFootwear() = arrayListOf(
	Pair(Shops(43, "MODOZA", MODOZA_RAT, false, App.instance.getString(R.string.id_44), MODOZA, R.drawable.modoza ),false),
	Pair(Shops(63, "TM Be easy", EASY_RAT, false, App.instance.getString(R.string.id_64), EASY, R.drawable.easyshopping),false),
	Pair(Shops(64, "Пеппи", PAPPY_RAT, false, App.instance.getString(R.string.id_65), PAPPY, R.drawable.peppy),false),
	Pair(Shops(65, "Babyart", BABYART_RAT, false, App.instance.getString(R.string.id_66), BABYART, R.drawable.babyart),false),
	Pair(Shops(66, "Love&Brand", LOVEBRAND_RAT, false, App.instance.getString(R.string.id_67), LOVEBRAND, R.drawable.lovebrand),false),
	Pair(Shops(67, "Garnamama", CARNAMAMA_RAT, false, App.instance.getString(R.string.id_68), CARNAMAMA, R.drawable.garnamama),false),
	Pair(Shops(68, "Леопольд", LEOPOLD_RAT, false, App.instance.getString(R.string.id_69), LEOPOLD, R.drawable.leopold),false),
	Pair(Shops(69, "KidsTime", KIDSTIME_RAT, false, App.instance.getString(R.string.id_70), KIDSTIME, R.drawable.kidstime),false),
	Pair(Shops(333, "Шалунишка", SHALUN_RAT, false, App.instance.getString(R.string.id_335), SHALUN, R.drawable.shalun),false),
	Pair(Shops(334, "BabyStores", BABYSTORE_RAT, false, App.instance.getString(R.string.id_336), BABYSTORE, R.drawable.babystor),false)
)

fun getChildrenToys() = arrayListOf(
	Pair(Shops(70, "Constructors", LEGO_RAT, false, App.instance.getString(R.string.id_71), LEGO, R.drawable.constructors),false),
	Pair(Shops(71, "Профи Тойс", PROFITOYS_RAT, false, App.instance.getString(R.string.id_72), PROFITOYS, R.drawable.profitoys),false),
	Pair(Shops(72, "Эмобили", EMOBIL_RAT, false, App.instance.getString(R.string.id_73), EMOBIL, R.drawable.emobil),false),
	Pair(Shops(73, "AmigoToy", AMIGOTOYS_RAT, false, App.instance.getString(R.string.id_74), AMIGOTOYS, R.drawable.amigo),false),
	Pair(Shops(74, "ИВАШКА", IVASHKA_RAT, false, App.instance.getString(R.string.id_75), IVASHKA, R.drawable.ivashka),false),
	Pair(Shops(61, "Lolo", LOLO_RAT, false, App.instance.getString(R.string.id_62), LOLO, R.drawable.lolo),false),
	Pair(Shops(75, "GoodtoyS", GOODSTOY_RAT, false, App.instance.getString(R.string.id_76), GOODSTOY, R.drawable.goodstoys),false),
	Pair(Shops(76, "joykids.kiev",	JOYKIDS_RAT, false, App.instance.getString(R.string.id_77), JOYKIDS, R.drawable.joykids),false),
	Pair(Shops(335, "МИРАМИДА",	MIRAMIDA_RAT, false, App.instance.getString(R.string.id_337), MIRAMIDA, R.drawable.miramida),false),
	Pair(Shops(336, "ТЯГА",	TYGA_RAT, false, App.instance.getString(R.string.id_338), TYGA, R.drawable.tyga),false)
)

fun getClocks() = arrayListOf(
	Pair(Shops(77, "Imidge", IMIDG_RAT, false, App.instance.getString(R.string.id_78), IMIDG, R.drawable.imidg),false),
	Pair(Shops(78, "TakeTime", TAKETIME_RAT, false, App.instance.getString(R.string.id_79), TAKETIME, R.drawable.taketime),false),
	Pair(Shops(79, "24K.UA", DCHK_RAT, false, App.instance.getString(R.string.id_80), DCHK, R.drawable.dchk),false),
	Pair(Shops(80, "SWISS-TIME", SWISS_RAT, false, App.instance.getString(R.string.id_81), SWISS, R.drawable.swisstime),false),
	Pair(Shops(81, "Ontime.watch", ONTIME_RAT, false, App.instance.getString(R.string.id_82), ONTIME, R.drawable.ontimewatch2),false),
	Pair(Shops(82, "Вектор Д", VECTOTD_RAT, false, App.instance.getString(R.string.id_83), VECTOTD, R.drawable.vectord),false),
	Pair(Shops(83, "Watch4you", WATCHYOU_RAT, false, App.instance.getString(R.string.id_84), WATCHYOU, R.drawable.watchforyou),false),
	Pair(Shops(337, "SWATCH", SWATCH_RAT, false, App.instance.getString(R.string.id_339), SWATCH, R.drawable.swatch),false),
	Pair(Shops(338, "Timebar", TIMEBAR_RAT, false, App.instance.getString(R.string.id_340), TIMEBAR, R.drawable.timebar),false),
	Pair(Shops(339, "Секунда", SECUNDA_RAT, false, App.instance.getString(R.string.id_341), SECUNDA, R.drawable.secunda),false)
)

fun getBooks() = arrayListOf(
	Pair(Shops(252, "Мегакнига", MEGAKNIGA_RAT, false, App.instance.getString(R.string.id_254), MEGAKNIGA, R.drawable.megakniga), false),
	Pair(Shops(253, "Лавка Бабуин", BABUIN_RAT, false, App.instance.getString(R.string.id_255), BABUIN, R.drawable.babuin), false),
	Pair(Shops(254, "Yakaboo", YAKABOO_RAT, false, App.instance.getString(R.string.id_256), YAKABOO, R.drawable.yakaboo), false),
	Pair(Shops(255, "Буклетка", BOOKLETKA_RAT, false, App.instance.getString(R.string.id_257), BOOKLETKA, R.drawable.bookletka), false),
	Pair(Shops(256, "Schooldream", SCOOLDR_RAT, false, App.instance.getString(R.string.id_258), SCOOLDR, R.drawable.schooldream), false),
	Pair(Shops(257, "Клуб Семейного Досуга", KSD_RAT, false, App.instance.getString(R.string.id_259), KSD, R.drawable.ksd), false),
	Pair(Shops(258, "Букля", BOOKLY_RAT, false, App.instance.getString(R.string.id_260), BOOKLY, R.drawable.booklya), false),
	Pair(Shops(259, "Book24.ua", BOOKTF_RAT, false, App.instance.getString(R.string.id_261), BOOKTF, R.drawable.book24), false),
	Pair(Shops(260, "Kniga.biz.ua", KNIGABIZ_RAT, false, App.instance.getString(R.string.id_262), KNIGABIZ, R.drawable.knigabiz), false),
	Pair(Shops(261, "Книголенд", KNIGOLAND_RAT, false, App.instance.getString(R.string.id_263), KNIGOLAND, R.drawable.knigoland), false),
)

fun getUniversal() = arrayListOf(
	Pair(Shops(9, "Epicentr", EPICENTR_RAT, false, App.instance.getString(R.string.id_10), EPICENTR, R.drawable.epicentr),false),
	Pair(Shops(262, "BelleShop", BELLES_RAT, false, App.instance.getString(R.string.id_264), BELLES, R.drawable.belles),false),
	Pair(Shops(263, "BestShopping", BESTSH_RAT, false, App.instance.getString(R.string.id_265), BESTSH, R.drawable.bestsh),false),
	Pair(Shops(264, "Miroshop", MIRO_RAT, false, App.instance.getString(R.string.id_266), MIRO, R.drawable.miro),false),
	Pair(Shops(265, "АКС", AKS_RAT, false, App.instance.getString(R.string.id_267), AKS, R.drawable.aks),false),
	Pair(Shops(266, "Lvivmarket", LVIV_MAR_RAT, false, App.instance.getString(R.string.id_268), LVIV_MAR, R.drawable.lvivmar),false),
	Pair(Shops(267, "GRENKA", GRENKA_RAT, false, App.instance.getString(R.string.id_269), GRENKA, R.drawable.grenka),false),
	Pair(Shops(268, "PRO100 MARKET", PR_STO_M_RAT, false, App.instance.getString(R.string.id_270), PR_STO_M, R.drawable.prstom),false),
	Pair(Shops(269, "Kasta", KASTA_RAT, false, App.instance.getString(R.string.id_271), KASTA, R.drawable.kasta),false),
	Pair(Shops(270, "F.ua", FUA_RAT, false, App.instance.getString(R.string.id_272), FUA, R.drawable.fua),false)
	)

fun getFood() = arrayListOf(
	Pair(Shops(271, "VivinoShop", VIVINO_RAT, false, App.instance.getString(R.string.id_273), VIVINO, R.drawable.vivino), false),
	Pair(Shops(272, "Bel Gusto", BELGUSTO_RAT, false, App.instance.getString(R.string.id_274), BELGUSTO, R.drawable.belgusto), false),
	Pair(Shops(273, "Кофегранд", GRAND_RAT, false, App.instance.getString(R.string.id_275), GRAND, R.drawable.grand), false),
	Pair(Shops(274, "ArtDrink", ARTDRINK_RAT, false, App.instance.getString(R.string.id_276), ARTDRINK, R.drawable.artdrink), false),
	Pair(Shops(275, "Суши Повар", SUSHI_RAT, false, App.instance.getString(R.string.id_277), SUSHI, R.drawable.sushi), false),
	Pair(Shops(276, "Ашан", ASHAN_RAT, false, App.instance.getString(R.string.id_278), ASHAN, R.drawable.ashan), false),
	Pair(Shops(277, "Чайный Дворик", DVORIK_RAT, false, App.instance.getString(R.string.id_279), DVORIK, R.drawable.dvorik), false),
	Pair(Shops(278, "Маленькая Италия", PICOLLA_RAT, false, App.instance.getString(R.string.id_280), PICOLLA, R.drawable.picollata), false),
	Pair(Shops(279, "Ікра Шоп", IKRA_RAT, false, App.instance.getString(R.string.id_281), IKRA, R.drawable.ikra), false),
	Pair(Shops(280, "Волинські Солодощі", CANDY_RAT, false, App.instance.getString(R.string.id_282), CANDY, R.drawable.candy), false)
)

fun getCoffeeTea() = arrayListOf(
	Pair(Shops(273, "Кофегранд", GRAND_RAT, false, App.instance.getString(R.string.id_275), GRAND, R.drawable.grand), false),
	Pair(Shops(277, "Чайный Дворик", DVORIK_RAT, false, App.instance.getString(R.string.id_279), DVORIK, R.drawable.dvorik), false),
	Pair(Shops(281, "КофейОК", COFFEOK_RAT, false, App.instance.getString(R.string.id_283), COFFEOK, R.drawable.coffeeok), false),
	Pair(Shops(282, "Chinachay", CHINACHAY_RAT, false, App.instance.getString(R.string.id_284), CHINACHAY, R.drawable.chinachay), false),
	Pair(Shops(283, "tea-market", TEAMARKET_RAT, false, App.instance.getString(R.string.id_285), TEAMARKET, R.drawable.teamarket), false),
	Pair(Shops(284, "Чайный", TEAPLACE_RAT, false, App.instance.getString(R.string.id_286), TEAPLACE, R.drawable.teaplace), false),
	Pair(Shops(285, "Украинская кофейная компания", UKRCOFFE_RAT, false, App.instance.getString(R.string.id_287), UKRCOFFE, R.drawable.ukrcoffe), false),
	Pair(Shops(286, "Grusha.ua", GRUSHA_RAT, false, App.instance.getString(R.string.id_288), GRUSHA, R.drawable.grusha), false),
	Pair(Shops(287, "TeaLao", TEALAO_RAT, false, App.instance.getString(R.string.id_289), TEALAO, R.drawable.tealao), false),
	Pair(Shops(288, "АВТ-Маркет", AVTMARKET_RAT, false, App.instance.getString(R.string.id_290), AVTMARKET, R.drawable.avtmarket), false)
	)

fun getSportsGoods() = arrayListOf(
	Pair(Shops(84, "Sport 90-60-90", DSHD_RAT, false, App.instance.getString(R.string.id_85), DSHD, R.drawable.dshd),false),
	Pair(Shops(85, "Terrasport", TERRASPORT_RAT,false, App.instance.getString(R.string.id_86), TERRASPORT, R.drawable.terrasport),false),
	Pair(Shops(86, "Груша", GROOSHA_RAT, false, App.instance.getString(R.string.id_87), GROOSHA, R.drawable.groosha),false),
	Pair(Shops(51, "PUMA", PUMA_RAT, false, App.instance.getString(R.string.id_52), PUMA, R.drawable.puma),false),
	Pair(Shops(87, "Viasport", VIASPORT_RAT, false, App.instance.getString(R.string.id_88), VIASPORT, R.drawable.viasport),false),
	Pair(Shops(88, "ADIDAS - adiTIME", ADIDAS_RAT, false, App.instance.getString(R.string.id_89), ADIDAS, R.drawable.adidas),false),
	Pair(Shops(89, "Протеин", PROTEIN_RAT, false, App.instance.getString(R.string.id_90), PROTEIN, R.drawable.proteinplus),false),
	Pair(Shops(90, "DomSporta", DOMSPORTA_RAT, false, App.instance.getString(R.string.id_91), DOMSPORTA, R.drawable.domsporta),false),
	Pair(Shops(91, "SportUA", SPORTUA_RAT, false, App.instance.getString(R.string.id_92), SPORTUA, R.drawable.sportua),false),
	Pair(Shops(340, "На пределе", NAPREDELE_RAT, false, App.instance.getString(R.string.id_342), NAPREDELE, R.drawable.napredele),false)
)

fun getGifts() = arrayListOf(
	Pair(Shops(79, "24K.UA", DCHK_RAT, false, App.instance.getString(R.string.id_80), DCHK, R.drawable.dchk),false),
	Pair(Shops(92, "За подарками", ZAPODAROK_RAT, false, App.instance.getString(R.string.id_93), ZAPODAROK, R.drawable.zapodarkami),false),
	Pair(Shops(93, "Мир Подарка", MIRPODARKA_RAT, false, App.instance.getString(R.string.id_94), MIRPODARKA, R.drawable.mirpodarka),false),
	Pair(Shops(94, "Gamesua", GAMESUA_RAT, false, App.instance.getString(R.string.id_95), GAMESUA, R.drawable.gamesua),false),
	Pair(Shops(95, "TOPs", TOPS_RAT, false, App.instance.getString(R.string.id_96), TOPS, R.drawable.tops),false),
	Pair(Shops(96, "Восточные сувениры", OSHOP_RAT, false, App.instance.getString(R.string.id_97), OSHOP, R.drawable.oshop),false),
	Pair(Shops(97, "Кактус", KAKTUS_RAT, false, App.instance.getString(R.string.id_98), KAKTUS, R.drawable.kaktus),false),
	Pair(Shops(98, "Ух-Ты!", YXTU_RAT, false, App.instance.getString(R.string.id_99), YXTU, R.drawable.yxtu),false),
	Pair(Shops(99, "Презента", PRESENTA_RAT, false, App.instance.getString(R.string.id_100), PRESENTA, R.drawable.presenta),false),
	Pair(Shops(341, "Podveski", PODVESKY_RAT, false, App.instance.getString(R.string.id_343), PODVESKY, R.drawable.podvesky),false)
)

fun getFlowers() = arrayListOf(
	Pair(Shops(289, "Флора Лайф", FLORALIFE_RAT, false, App.instance.getString(R.string.id_291), FLORALIFE, R.drawable.floralife), false),
	Pair(Shops(290, "UFL (SendFlowers)", UFL_RAT, false, App.instance.getString(R.string.id_292), UFL, R.drawable.ufl), false),
	Pair(Shops(291, "Служба международных поздравлений", SEVENROSE_RAT, false, App.instance.getString(R.string.id_293), SEVENROSE, R.drawable.sevenrose), false),
	Pair(Shops(292, "BuketLand", BUKLAND_RAT, false, App.instance.getString(R.string.id_294), BUKLAND, R.drawable.bukland), false),
	Pair(Shops(293, "Flowers.ua", FLOWERSUA_RAT, false, App.instance.getString(R.string.id_295), FLOWERSUA, R.drawable.flowersua), false),
	Pair(Shops(22, "Флориум", FLORIUM_RAT, false, App.instance.getString(R.string.id_23), FLORIUM, R.drawable.florium),false),
	Pair(Shops(294, "Matla Flowers", MALTAFLOW_RAT, false, App.instance.getString(R.string.id_296), MALTAFLOW, R.drawable.maltaflo), false),
	Pair(Shops(295, "Agro-Market", AGROMARKET_RAT, false, App.instance.getString(R.string.id_297), AGROMARKET, R.drawable.agromarket), false),
	Pair(Shops(296, "КвітоСвіт", KVITOSVIT_RAT, false, App.instance.getString(R.string.id_298), KVITOSVIT, R.drawable.kvitosvit), false),
	Pair(Shops(297, "Viola Kvity", VIOLAKVITY_RAT, false, App.instance.getString(R.string.id_299), VIOLAKVITY, R.drawable.viola), false)
)

fun getEverythingForHoliday() = arrayListOf(
	Pair(Shops(101, "4party", FORPATY_RAT, false, App.instance.getString(R.string.id_102), FORPATY, R.drawable.fparty),false),
	Pair(Shops(102, "ПРАЗДНИК- ШОП",PRAZDNIK_RAT, false, App.instance.getString(R.string.id_103), PRAZDNIK, R.drawable.prazdnik),false),
	Pair(Shops(103, "Rizdvo", RIZDVO_RAT, false, App.instance.getString(R.string.id_104), RIZDVO, R.drawable.rizdvo),false),
	Pair(Shops(104, "TIMESTAR", TIMESTAR_RAT, false, App.instance.getString(R.string.id_105), TIMESTAR, R.drawable.timestar),false),
	Pair(Shops(105, "Весёлая затея", SHARIK_RAT, false, App.instance.getString(R.string.id_106), SHARIK, R.drawable.patyhata),false),
	Pair(Shops(342, "FunFun", FUNFUN_RAT, false, App.instance.getString(R.string.id_344), FUNFUN, R.drawable.funfun),false),
	Pair(Shops(343, "Святобум", SVYATOBOOM_RAT, false, App.instance.getString(R.string.id_345), SVYATOBOOM, R.drawable.svyatoboom),false),
	Pair(Shops(344, "Мега Свято", MEGASVYTO_RAT, false, App.instance.getString(R.string.id_346), MEGASVYTO, R.drawable.megasvyto),false),
	Pair(Shops(345, "Шалене свято", SHALSVYTO_RAT, false, App.instance.getString(R.string.id_347), SHALSVYTO, R.drawable.shalsvyto),false),
	Pair(Shops(346, "Праздникопт", PRZDOPT_RAT, false, App.instance.getString(R.string.id_348), PRZDOPT, R.drawable.prazdopt),false)
)

fun getCosmeticsAndPerfumes() = arrayListOf(
	Pair(Shops(106, "CosmeticShop", COSMETIC_RAT, false, App.instance.getString(R.string.id_107), COSMETIC, R.drawable.cosmeticshop),false),
	Pair(Shops(107, "MakeUp", MAKEUP_RAT, false, App.instance.getString(R.string.id_108), MAKEUP, R.drawable.makeup),false),
	Pair(Shops(108, "Profistyle", PROFISTYLE_RAT, false, App.instance.getString(R.string.id_109), PROFISTYLE, R.drawable.profistyle),false),
	Pair(Shops(109, "Eau De Parfum", EDP_RAT, false, App.instance.getString(R.string.id_110), EDP, R.drawable.edp),false),
	Pair(Shops(110, "Aromat", AROMAT_RAT, false, App.instance.getString(R.string.id_111), AROMAT, R.drawable.aromat),false),
	Pair(Shops(111, "Екабьюти", ECOBEAUTY_RAT, false, App.instance.getString(R.string.id_112), ECOBEAUTY, R.drawable.ecobeaute),false),
	Pair(Shops(112, "Bomond", BOMOND_RAT, false, App.instance.getString(R.string.id_113), BOMOND, R.drawable.bomond),false),
	Pair(Shops(113, "Ламбре", LAMBRE_RAT, false, App.instance.getString(R.string.id_114), LAMBRE, R.drawable.lambre),false),
	Pair(Shops(114, "Watsons", WATSON_RAT, false, App.instance.getString(R.string.id_115), WATSON, R.drawable.watsons),false),
	Pair(Shops(115, "EVA", EVA_RAT, false, App.instance.getString(R.string.id_116), EVA, R.drawable.eva),false)
)

fun getJewelry() = arrayListOf(
	Pair(Shops(116, "Zlato", ZLATO_RAT, false, App.instance.getString(R.string.id_117), ZLATO, R.drawable.zlato),false),
	Pair(Shops(117, "Золотой стандарт", ZSTANDART_RAT, false, App.instance.getString(R.string.id_118), ZSTANDART, R.drawable.zolotoystandart),false),
	Pair(Shops(118, "AURUM", AURUM_RAT, false, App.instance.getString(R.string.id_119), AURUM, R.drawable.aurum),false),
	Pair(Shops(119, "Gold", GOLD_RAT, false, App.instance.getString(R.string.id_120), GOLD, R.drawable.gold),false),
	Pair(Shops(120, "Золотой Век", ZVEK_RAT, false, App.instance.getString(R.string.id_121), ZVEK, R.drawable.zolotoyvek),false),
	Pair(Shops(121, "Укрзолото", UKRZOLOTO_RAT, false, App.instance.getString(R.string.id_122), UKRZOLOTO, R.drawable.ukrzoloto),false),
	Pair(Shops(122, "SOVA Jewels", SOVA_RAT, false, App.instance.getString(R.string.id_123), SOVA, R.drawable.sovajewels),false),
	Pair(Shops(123, "ZARINA", ZARINA_RAT, false, App.instance.getString(R.string.id_124), ZARINA, R.drawable.zarina),false),
	Pair(Shops(347, "Oniks", ONIKS_RAT, false, App.instance.getString(R.string.id_349), ONIKS, R.drawable.oniks),false),
	Pair(Shops(348, "Pandora", PANDORA_RAT, false, App.instance.getString(R.string.id_350), PANDORA, R.drawable.pandora),false)
)

fun getBijouterie() = arrayListOf(
	Pair(Shops(298, "Bijouella", BIJOUELLA_RAT, false, App.instance.getString(R.string.id_300), BIJOUELLA, R.drawable.bijoulla), false),
	Pair(Shops(299, "Brasletik", BRASLETIK_RAT, false, App.instance.getString(R.string.id_301), BRASLETIK, R.drawable.brasletik), false),
	Pair(Shops(300, "Les Nereides (Франция)", LESNER_RAT, false, App.instance.getString(R.string.id_302), LESNER, R.drawable.lesnereides), false),
	Pair(Shops(301, "SUNSTONES", SUNSTONE_RAT, false, App.instance.getString(R.string.id_303), SUNSTONE, R.drawable.sunstone), false),
	Pair(Shops(302, "Zakolochka", ZACOLOCHKA_RAT, false, App.instance.getString(R.string.id_304), ZACOLOCHKA, R.drawable.zakolochka), false),
	Pair(Shops(303, "Конфитюр", CONFITUR_RAT, false, App.instance.getString(R.string.id_305), CONFITUR, R.drawable.konfitur), false),
	Pair(Shops(304, "Бьютик", E_BUTIK_RAT, false, App.instance.getString(R.string.id_306), E_BUTIK, R.drawable.biutik), false),
	Pair(Shops(305, "Xstyle", X_STYLE_RAT, false, App.instance.getString(R.string.id_307), X_STYLE, R.drawable.xstyle), false),
	Pair(Shops(306, "ZIGZAG", ZIGZAG_RAT, false, App.instance.getString(R.string.id_308), ZIGZAG, R.drawable.zigzag), false),
	Pair(Shops(307, "ФРОМСТОНЕС", FROMSTONE_RAT, false, App.instance.getString(R.string.id_309), FROMSTONE, R.drawable.fromstone), false)
)

fun getLeisureAndTourism() = arrayListOf(
	Pair(Shops(124, "INTEX-SHOP", INDEXSHOP_RAT, false, App.instance.getString(R.string.id_125), INDEXSHOP, R.drawable.intexshop),false),
	Pair(Shops(125, "Trofey", TROFEY_RAT, false, App.instance.getString(R.string.id_126), TROFEY, R.drawable.trofey),false),
	Pair(Shops(126, "Капитан", KAPITAN_RAT, false, App.instance.getString(R.string.id_127), KAPITAN, R.drawable.kapitan),false),
	Pair(Shops(127, "Aparat", APARAT_RAT, false, App.instance.getString(R.string.id_128), APARAT, R.drawable.aparat),false),
	Pair(Shops(128, "070", NST_RAT, false, App.instance.getString(R.string.id_129), NST, R.drawable.nsn),false),
	Pair(Shops(129, "X-ZONE", XZONE_RAT, false, App.instance.getString(R.string.id_130), XZONE, R.drawable.xzone),false),
	Pair(Shops(130, "Северная стена", NORTHWALL_RAT, false, App.instance.getString(R.string.id_131), NORTHWALL, R.drawable.northwall),false),
	Pair(Shops(131, "Мультиспорт", MULTISPORT_RAT, false, App.instance.getString(R.string.id_132), MULTISPORT, R.drawable.multisport),false),
	Pair(Shops(349, "Екстрем Стайл", EXTREMST_RAT, false, App.instance.getString(R.string.id_351), EXTREMST, R.drawable.extremst),false),
	Pair(Shops(350, "Gorgany", GORGANY_RAT, false, App.instance.getString(R.string.id_352), GORGANY, R.drawable.gorgany),false)
)

fun getHuntingAndFishing() = arrayListOf(
	Pair(Shops(125, "Trofey", TROFEY_RAT, false, App.instance.getString(R.string.id_126), TROFEY, R.drawable.trofey),false),
	Pair(Shops(132, "Militarka", MILITARKA_RAT, false, App.instance.getString(R.string.id_133), MILITARKA, R.drawable.militarka),false),
	Pair(Shops(127, "Aparat", APARAT_RAT, false, App.instance.getString(R.string.id_128), APARAT, R.drawable.aparat),false),
	Pair(Shops(133, "Рибалка", BEREG_RAT, false, App.instance.getString(R.string.id_134), BEREG, R.drawable.bereg),false),
	Pair(Shops(134, "PROFISH", PROFISH_RAT, false, App.instance.getString(R.string.id_135), PROFISH, R.drawable.profish),false),
	Pair(Shops(135, "Nitecore", NITECORE_RAT, false, App.instance.getString(R.string.id_136), NITECORE, R.drawable.nitecore),false),
	Pair(Shops(136, "FishingStock", FISHSTOCK_RAT, false, App.instance.getString(R.string.id_137), FISHSTOCK, R.drawable.fishstock),false),
	Pair(Shops(137, "FISH-FISH", FISHFISH_RAT, false, App.instance.getString(R.string.id_138), FISHFISH, R.drawable.fishfish),false),
	Pair(Shops(138, "ШТУРМ", SHTURM_RAT, false, App.instance.getString(R.string.id_139), SHTURM, R.drawable.shturm),false),
	Pair(Shops(139, "Военторг ДиСи", VOENTORG_RAT, false, App.instance.getString(R.string.id_140), VOENTORG, R.drawable.voentorg),false)
)

fun getHobbies() = arrayListOf(
	Pair(Shops(140, "ХоббиТорг", HOBBY_RAT, false, App.instance.getString(R.string.id_141), HOBBY, R.drawable.hobby2),false),
	Pair(Shops(141, "ST-MARKET", STMARKET_RAT, false, App.instance.getString(R.string.id_142), STMARKET, R.drawable.stmarket),false),
	Pair(Shops(142, "Сотворчество",SOTVORCHESTVO_RAT, false, App.instance.getString(R.string.id_143), SOTVORCHESTVO, R.drawable.sotvorchestvo),false),
	Pair(Shops(143, "Голка", GOLKA_RAT, false, App.instance.getString(R.string.id_144), GOLKA, R.drawable.golka),false),
	Pair(Shops(144, "Colorsound", CSOUND_RAT, false, App.instance.getString(R.string.id_145), CSOUND, R.drawable.colorsoundshop),false),
	Pair(Shops(145, "Modeli", MODELI_RAT, false, App.instance.getString(R.string.id_146), MODELI, R.drawable.logomodeli),false),
	Pair(Shops(146, "ЕТНОХАТА", ETNOXATA_RAT, false, App.instance.getString(R.string.id_147), ETNOXATA, R.drawable.etnoxata),false),
	Pair(Shops(147, "Games Collection", GAMECOLL_RAT, false, App.instance.getString(R.string.id_148), GAMECOLL, R.drawable.gamescollection),false),
	Pair(Shops(351, "Крутиголов", KRHOLOV_RAT, false, App.instance.getString(R.string.id_353), KRHOLOV, R.drawable.krgolov),false),
	Pair(Shops(352, "OpticalMarket", OPTICAL_RAT, false, App.instance.getString(R.string.id_354), OPTICAL, R.drawable.optical),false)
)

fun getHealthProducts() = arrayListOf(
	Pair(Shops(148, "RB.UA", RB_RAT, false, App.instance.getString(R.string.id_149), RB, R.drawable.rb),false),
	Pair(Shops(149, "ВАШЕ ЗДОРОВЬЕ", MED_RAT, false, App.instance.getString(R.string.id_150), MED, R.drawable.med),false),
	Pair(Shops(150, "interlinz", ILINZ_RAT, false, App.instance.getString(R.string.id_151), ILINZ, R.drawable.linz),false),
	Pair(Shops(151, "Мед-Шоп", MEDSHOP_RAT, false, App.instance.getString(R.string.id_152), MEDSHOP, R.drawable.medshop),false),
	Pair(Shops(152, "SalonOrtop", ORTOP_RAT, false, App.instance.getString(R.string.id_153), ORTOP, R.drawable.ortop),false),
	Pair(Shops(153, "Goldenfarm", GOLDENFARM_RAT, false, App.instance.getString(R.string.id_154), GOLDENFARM, R.drawable.goldenpharm),false),
	Pair(Shops(154, "Здорова Лавка", ZDOROVALAVKA_RAT, false, App.instance.getString(R.string.id_155), ZDOROVALAVKA, R.drawable.lavka),false),
	Pair(Shops(155, "Био Украина", BIOUKR_RAT, false, App.instance.getString(R.string.id_156), BIOUKR, R.drawable.bioukr),false),
	Pair(Shops(353, "Территория Линз", TERLINZ_RAT, false, App.instance.getString(R.string.id_355), TERLINZ, R.drawable.terlinz),false),
	Pair(Shops(354, "Орто-Лайн", ORTOLINE_RAT, false, App.instance.getString(R.string.id_356), ORTOLINE, R.drawable.ortoline),false)
)

fun getOnlinePharmacies() = arrayListOf(
	Pair(Shops(156, "Apteka 911", APTEKADOO_RAT, false, App.instance.getString(R.string.id_157), APTEKADOO, R.drawable.apteka911),false),
	Pair(Shops(157, "АПТЕКА 24", APTEKADCH_RAT, false, App.instance.getString(R.string.id_158), APTEKADCH, R.drawable.apteka24),false),
	Pair(Shops(158, "АПТЕКА ПЛЮС", APTPLUS_RAT, false, App.instance.getString(R.string.id_159), APTPLUS, R.drawable.aptekaplus),false),
	Pair(Shops(159, "Tabletki", TABLETKI_RAT, false, App.instance.getString(R.string.id_160), TABLETKI, R.drawable.tabletki),false),
	Pair(Shops(160, "Аптека Доброго Дня", APTGOODDAY_RAT, false, App.instance.getString(R.string.id_161), APTGOODDAY, R.drawable.add),false),
	Pair(Shops(161, "Мед-Сервис", APTONLINE_RAT, false, App.instance.getString(R.string.id_162), APTONLINE, R.drawable.onlineapteka),false),
	Pair(Shops(162, "1 Социальная Аптека", OSA_RAT, false, App.instance.getString(R.string.id_163), OSA, R.drawable.osa),false),
	Pair(Shops(163, "АПТЕКАРЬ", APTEKAR_RAT, false, App.instance.getString(R.string.id_164), APTEKAR, R.drawable.aptekar),false),
	Pair(Shops(355, "Лекфарм 36.6", LEKFARM_RAT, false, App.instance.getString(R.string.id_357), LEKFARM, R.drawable.lekfarm),false),
	Pair(Shops(356, "Рецептика", RECEPTIKA_RAT, false, App.instance.getString(R.string.id_358), RECEPTIKA, R.drawable.receptika),false)
)

fun getAutoProducts() = arrayListOf(
	Pair(Shops(164, "AutoWiper", WIPER_RAT, false, App.instance.getString(R.string.id_165), WIPER, R.drawable.autuwiper),false),
	Pair(Shops(165, "АВТОБРАТ", AUTUBRAT_RAT, false, App.instance.getString(R.string.id_166), AUTUBRAT, R.drawable.autobrat),false),
	Pair(Shops(166, "amax", AMAX_RAT, false, App.instance.getString(R.string.id_167), AMAX, R.drawable.amax),false),
	Pair(Shops(167, "Akym", ACYM_RAT, false, App.instance.getString(R.string.id_168), ACYM, R.drawable.acym),false),
	Pair(Shops(168, "Pitstore", PISTORE_RAT, false, App.instance.getString(R.string.id_169), PISTORE, R.drawable.pistore),false),
	Pair(Shops(169, "Multibox", MULTIBOX_RAT, false, App.instance.getString(R.string.id_170), MULTIBOX, R.drawable.multibox),false),
	Pair(Shops(170, "130", STRT_RAT, false, App.instance.getString(R.string.id_171), STRT, R.drawable.strt),false),
	Pair(Shops(171, "Автошара", AUTUSHARA_RAT, false, App.instance.getString(R.string.id_172), AUTUSHARA, R.drawable.autoshara),false),
	Pair(Shops(357, "База Автозвука", AUTOZVUK_RAT, false, App.instance.getString(R.string.id_359), AUTOZVUK, R.drawable.autobaza),false),
	Pair(Shops(358, "Dvorniki", DVORNIKI_RAT, false, App.instance.getString(R.string.id_360), DVORNIKI, R.drawable.dvorniki),false)
)

fun getAutoParts() = arrayListOf(
	Pair(Shops(172, "Massive", MASSIV_RAT, false, App.instance.getString(R.string.id_173), MASSIV, R.drawable.massive),false),
	Pair(Shops(173, "Автоэлектрика", AUTOELECTR_RAT, false, App.instance.getString(R.string.id_174), AUTOELECTR, R.drawable.autoelectrica),false),
	Pair(Shops(174, "Азия центр", ASIACENTR_RAT, false, App.instance.getString(R.string.id_175), ASIACENTR, R.drawable.asiacentr),false),
	Pair(Shops(175, "DOK", DOK_RAT, false, App.instance.getString(R.string.id_176), DOK, R.drawable.dok),false),
	Pair(Shops(176, "АвтоКлад", AUTOKLAD_RAT, false, App.instance.getString(R.string.id_177), AUTOKLAD, R.drawable.autoklad),false),
	Pair(Shops(177, "VCE", VSE_RAT, false, App.instance.getString(R.string.id_178), VSE, R.drawable.vce),false),
	Pair(Shops(178, "Exist", EXIST_RAT, false, App.instance.getString(R.string.id_179), EXIST, R.drawable.exist),false),
	Pair(Shops(179, "JAPAN-CARS", JAPAN_RAT, false, App.instance.getString(R.string.id_180), JAPAN, R.drawable.japancars),false),
	Pair(Shops(359, "Запчасти 24", ZTF_RAT, false, App.instance.getString(R.string.id_361), ZTF, R.drawable.z24),false),
	Pair(Shops(360, "ВСЕ ДЛЯ АВТОМОБІЛЯ", VSEFORAUTO_RAT, false, App.instance.getString(R.string.id_362), VSEFORAUTO, R.drawable.vseforauto),false)
)

fun getTiresAndWheels() = arrayListOf(
	Pair(Shops(180, "infoshina", INFOSHINA_RAT, false, App.instance.getString(R.string.id_181), INFOSHINA, R.drawable.infoshina),false),
	Pair(Shops(181, "Автошины", AUTOSHINA_RAT, false, App.instance.getString(R.string.id_182), AUTOSHINA, R.drawable.autoshini),false),
	Pair(Shops(182, "Шипшина", SHYP_RAT, false, App.instance.getString(R.string.id_183), SHYP, R.drawable.shypshyna),false),
	Pair(Shops(183, "АВТОСЕЗОН", SEZON_RAT, false, App.instance.getString(R.string.id_184), SEZON, R.drawable.autosezon),false),
	Pair(Shops(184, "Rezina", REZINA_RAT, false, App.instance.getString(R.string.id_185), REZINA, R.drawable.rezina),false),
	Pair(Shops(185, "RADIUS", RADIUS_RAT, false, App.instance.getString(R.string.id_186), RADIUS, R.drawable.radius),false),
	Pair(Shops(186, "Аскания - шина", ASCANIA_RAT, false, App.instance.getString(R.string.id_187), ASCANIA, R.drawable.ascaniashina),false),
	Pair(Shops(187, "Альфа Шина", ASHINA_RAT, false, App.instance.getString(R.string.id_188), ASHINA, R.drawable.alfashina),false),
	Pair(Shops(361, "120 км/ч", STODV_RAT, false, App.instance.getString(R.string.id_363), STODV, R.drawable.stodv),false),
	Pair(Shops(362, "TIRESHOP", TIRESHOP_RAT, false, App.instance.getString(R.string.id_364), TIRESHOP, R.drawable.tireshop),false)
)

fun getClimateEquipment() = arrayListOf(
	Pair(Shops(2, "Vencon", VENCON_RAT, false, App.instance.getString(R.string.id_3), VENCON, R.drawable.vencon),false),
	Pair(Shops(188, "КлімаТрон", KLIMATRON_RAT, false, App.instance.getString(R.string.id_189), KLIMATRON, R.drawable.klimatron),false),
	Pair(Shops(189, "Jin", JIN_RAT, false, App.instance.getString(R.string.id_190), JIN, R.drawable.jin),false),
	Pair(Shops(190, "Климатика", CLIMATICA_RAT, false, App.instance.getString(R.string.id_191), CLIMATICA, R.drawable.climatica),false),
	Pair(Shops(191, "23 Цельсия", TWTHR_RAT, false, App.instance.getString(R.string.id_192),TWTHR, R.drawable.twthr),false),
	Pair(Shops(192, "ТЕПЛОСФЕРА", TEPLOSFERA_RAT, false, App.instance.getString(R.string.id_193),TEPLOSFERA, R.drawable.teplosfera),false),
	Pair(Shops(193, "ЭкоДом", ECODIM_RAT, false, App.instance.getString(R.string.id_194),ECODIM, R.drawable.ecodim),false),
	Pair(Shops(194, "ТЕПЛОТА", TEPLOTA_RAT, false, App.instance.getString(R.string.id_195),TEPLOTA, R.drawable.teplota),false),
	Pair(Shops(363, "UkrClimat", UKRCLIMAT_RAT, false, App.instance.getString(R.string.id_365), UKRCLIMAT, R.drawable.ukrclimat),false),
	Pair(Shops(364, "Цифра Плюс", CIFRA_RAT, false, App.instance.getString(R.string.id_366), CIFRA, R.drawable.cifra),false)
)

fun getDishes() = arrayListOf(
	Pair(Shops(195, "LORA", LORA_RAT, false, App.instance.getString(R.string.id_196), LORA, R.drawable.lora),false),
	Pair(Shops(196, "VIP-POSUDA", VIPPOSUD_RAT, false, App.instance.getString(R.string.id_197), VIPPOSUD, R.drawable.vip_posud),false),
	Pair(Shops(197, "Posudy.net", POSUDANET_RAT, false, App.instance.getString(R.string.id_198), POSUDANET, R.drawable.posudynet),false),
	Pair(Shops(198, "Promaster", PROMASTER_RAT, false, App.instance.getString(R.string.id_199), PROMASTER, R.drawable.promaster),false),
	Pair(Shops(199, "BergHOFF", BERGOFF_RAT, false, App.instance.getString(R.string.id_200), BERGOFF, R.drawable.bergoff),false),
	Pair(Shops(200, "Krauff",KRAUFF_RAT, false, App.instance.getString(R.string.id_201), KRAUFF, R.drawable.krauff),false),
	Pair(Shops(201, "Luminarc", LUMINARC_RAT, false, App.instance.getString(R.string.id_202), LUMINARC, R.drawable.luminark),false),
	Pair(Shops(202, "ПОСУДА", POSUDA_RAT, false, App.instance.getString(R.string.id_203), POSUDA, R.drawable.posuda),false),
	Pair(Shops(365, "ФОРВАРД", FORVARD_RAT, false, App.instance.getString(R.string.id_367), FORVARD, R.drawable.forvard),false),
	Pair(Shops(366, "Мир посуды", MIRPOSUD_RAT, false, App.instance.getString(R.string.id_368), MIRPOSUD, R.drawable.mirposudy),false)
)

fun getBagsBriefcasesWallets() = arrayListOf(
	Pair(Shops(100, "BlankNote", BAGS_RAT, false, App.instance.getString(R.string.id_101), BAGS, R.drawable.blanknote),false),
	Pair(Shops(203, "Мистер Воллет", WALLET_RAT, false, App.instance.getString(R.string.id_204), WALLET, R.drawable.wallet),false),
	Pair(Shops(204, "E-torba", ETORBA_RAT, false, App.instance.getString(R.string.id_205), ETORBA, R.drawable.etorba),false),
	Pair(Shops(205, "Bagboom", BAGBOOM_RAT, false, App.instance.getString(R.string.id_206), BAGBOOM, R.drawable.bagboom),false),
	Pair(Shops(206, "Trade-City", TRADECITY_RAT, false, App.instance.getString(R.string.id_207),TRADECITY, R.drawable.tradecity),false),
	Pair(Shops(207, "Neri Karra", NERYCARA_RAT, false, App.instance.getString(R.string.id_208), NERYCARA, R.drawable.nerycara),false),
	Pair(Shops(208, "LeGRAND", LEGRAD_RAT, false, App.instance.getString(R.string.id_209), LEGRAD, R.drawable.legrand),false),
	Pair(Shops(209, "Travel Store", TREVELSTORE_RAT, false, App.instance.getString(R.string.id_210), TREVELSTORE, R.drawable.trevelstore),false),
	Pair(Shops(367, "Walberry", WALBERY_RAT, false, App.instance.getString(R.string.id_369), WALBERY, R.drawable.walberry),false),
	Pair(Shops(368, "MODNOTAK", MODNOTAK_RAT, false, App.instance.getString(R.string.id_370), MODNOTAK, R.drawable.modnotak),false)
)

fun getPetSupplies() = arrayListOf(
	Pair(Shops(210, "Zooparadise", ZOOPAR_RAT, false, App.instance.getString(R.string.id_211), ZOOPAR, R.drawable.zooparadise),false),
	Pair(Shops(211, "EZoo", PETS_RAT, false, App.instance.getString(R.string.id_212), PETS, R.drawable.ezoo),false),
	Pair(Shops(212, "Зоокомплекс", ZOOCOMPLEX_RAT, false, App.instance.getString(R.string.id_213), ZOOCOMPLEX, R.drawable.zoocomplex),false),
	Pair(Shops(213, "Рыжий Кот", ZOOAPTEKA_RAT, false, App.instance.getString(R.string.id_214), ZOOAPTEKA, R.drawable.zooaptekakiev),false),
	Pair(Shops(214, "Зверушка", ZVERUSHKA_RAT, false, App.instance.getString(R.string.id_215), ZVERUSHKA, R.drawable.zverushka),false),
	Pair(Shops(215, "Ветмаркет", VETMARKET_RAT, false, App.instance.getString(R.string.id_216), VETMARKET, R.drawable.vetmarket),false),
	Pair(Shops(216, "ZOO", ZOO_RAT, false, App.instance.getString(R.string.id_217), ZOO, R.drawable.zoo),false),
	Pair(Shops(217, "ZooFavorit", FAVORITE_RAT, false, App.instance.getString(R.string.id_218), FAVORITE, R.drawable.favorite),false),
	Pair(Shops(369, "Фауна", FAUNAM_RAT, false, App.instance.getString(R.string.id_371), FAUNAM, R.drawable.faunamarket),false),
	Pair(Shops(370, "ПетМаркет", PETMARKET_RAT, false, App.instance.getString(R.string.id_372), PETMARKET, R.drawable.petmarket),false)
)

fun getMiscellaneous() = arrayListOf(
	Pair(Shops(218, "ДуДа", DUDDA_RAT, false, App.instance.getString(R.string.id_219), DUDDA, R.drawable.duda),false),
	Pair(Shops(219, "Megazakaz", MEGAZAKAZ_RAT, false, App.instance.getString(R.string.id_220), MEGAZAKAZ, R.drawable.megazakaz),false),
	Pair(Shops(220, "Worldvision",  WVISION_RAT, false, App.instance.getString(R.string.id_221),  WVISION, R.drawable.wvision),false),
	Pair(Shops(221, "Фотобум", PHOTOBOOM_RAT, false, App.instance.getString(R.string.id_222), PHOTOBOOM, R.drawable.photoboom),false),
	Pair(Shops(222, "Altshop", ALTEGH_RAT, false, App.instance.getString(R.string.id_223), ALTEGH, R.drawable.altegh),false),
	Pair(Shops(223, "Абразив", ABRAZIV_RAT, false, App.instance.getString(R.string.id_224), ABRAZIV, R.drawable.abraziv),false),
	Pair(Shops(224, "Dumok", DUMOK_RAT, false, App.instance.getString(R.string.id_225), DUMOK, R.drawable.dumok),false),
	Pair(Shops(225, "ЧП Ворон", VORON_RAT, false, App.instance.getString(R.string.id_226), VORON, R.drawable.voron),false),
	Pair(Shops(371, "Bongstar", BONGO_RAT, false, App.instance.getString(R.string.id_373), BONGO, R.drawable.bongo),false),
	Pair(Shops(372, "Yakov", YAKOV_RAT, false, App.instance.getString(R.string.id_374), YAKOV, R.drawable.yakov),false)
)
val mapShops = mutableMapOf(
	0 to getAppliancesShops(),
	1 to getCompAndElectrShops(),
	2 to getSmartphonesAndPhones(),
	3 to getConstructionAndRenovation(),
	4 to getDesignAndDecor(),
	5 to getGardenAndVegetable(),
	6 to getFurniture(),
	7 to getHouseholdProducts(),
	8 to getOfficeSupplies(),
	9 to getClothes(),
	10 to getShoes(),
	11 to getUnderwear(),
	12 to getBabyProducts(),
	13 to getChildrenClothingAndFootwear(),
	14 to getChildrenToys(),
	15 to getClocks(),
	16 to getBooks(),
	17 to getUniversal(),
	18 to getFood(),
	19 to getCoffeeTea(),
	20 to getSportsGoods(),
	21 to getGifts(),
	22 to getFlowers(),
	23 to getEverythingForHoliday(),
	24 to getCosmeticsAndPerfumes(),
	25 to getJewelry(),
	26 to getBijouterie(),
	27 to getLeisureAndTourism(),
	28 to getHuntingAndFishing(),
	29 to getHobbies(),
	30 to getHealthProducts(),
	31 to getOnlinePharmacies(),
	32 to getAutoProducts(),
	33 to getAutoParts(),
	34 to getTiresAndWheels(),////////////////////////////////////////
	35 to getClimateEquipment(),
	36 to getDishes(),
	37 to getBagsBriefcasesWallets(),
	38 to getPetSupplies(),
	39 to getMiscellaneous()
)

