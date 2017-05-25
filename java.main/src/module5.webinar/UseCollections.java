package module5.webinar;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by citsym on 22.05.17.
 */
public class UseCollections {

    public static final int ID_CODE = 232324295;

    public static void main(String[] args) {

        // id code, FIO, adres, sex

        Map<Integer, PersonTO> map = new HashMap<>();

        map.put(123123123, new PersonTO("Пугачев Н,G", "Some street", "Female"));
        map.put(234324292 ,new PersonTO("Пугачев Н,П", "Some street", "Female"));
        map.put(234324293 ,new PersonTO("Алеев К,Т", "Some street", "Female"));
        map.put(234324294 ,new PersonTO("Мирон В,О", "Some street", "Female"));
        map.put(232324295 ,new PersonTO("Никитина Т,П", "Best place", "Female"));
        map.put(234324296 ,new PersonTO("Олька А,Ц", "Some street", "Male"));
        map.put(234324297 ,new PersonTO("Олька А,Ц", "Some street", "Male"));

        String adress =  getAdressByIdCode(ID_CODE, map);

        System.out.println("Adress to find " + adress);

        Collection<PersonTO> persons = map.values();

        ArrayList<PersonTO> sortedList = new ArrayList<PersonTO>(persons);

        Comparator<PersonTO> fioComparator = (o1, o2) -> o1.getFio().compareTo(o2.getFio());

        Collections.sort(sortedList, fioComparator);

//        printPesonList(sortedList);


        List<PersonTO> filterPersonsWtMale = map.values().stream()
//                .filter(p -> p.getSex().equals("Female"))
                .sorted(fioComparator)
                .collect(Collectors.toList());

        printPesonList(filterPersonsWtMale);


    }

    private static void printPesonList(List<PersonTO> sortedList) {
        for (PersonTO personTO : sortedList) {
            System.out.println(personTO);
        }
    }

    static String getAdressByIdCode(int idCode, Map<Integer, PersonTO> map) {
        printPesonList(new ArrayList<>(map.values()));
        return map.get(idCode).getStreet();
    }
}
