package e.aqibqureshi.imci.activities.data;

import java.util.ArrayList;
import java.util.List;

public class FakeData {
    private static String[] title = {"Severe Pneumonia Or Very Sever Desease",
                              "Pneunonia",
                                "Cough Or Cold"};

    private static String[] description = {"Give =first dose of ampicillin OR ceftriaxone IM. (p.13 )\n" +
                                    "\uDBC0\uDCBE If child under 6months old: give 5 mls co-trimoxazole stat\n" +
                                    "\uDBC0\uDCBE Give oxygen (p. 13 )\n" +
                                    "\uDBC0\uDCBE If stridor: give nebulised adrenaline (p.13 )\n" +
                                    "\uDBC0\uDCBE Test blood sugar. Then treat/prevent low blood sugar (p. 14 )\n" +
                                    "\uDBC0\uDCBE Keep child warm, and refer URGENTLY to hospital.",
                                        "second"};


    public static List<SickChild2To5> getFakeData() {
        List<SickChild2To5> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            list.add(new SickChild2To5(title[i], description[0]));
        }

        return list;
    }
}
