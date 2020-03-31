import java.util.*;
import java.util.stream.Collectors;

public class Testklass {

    public static void main(String[] args) {
        //Praegu saab ainult ühe kontserdi ja piletimüügi luua, muidu kood ei tööta, peaks tegema
        //vist siis alamklassi, aga ma hetkel seda veel ei oska.
        // Kontsert kontsert1 = new Kontsert("Päike", "Vanemuise kontserdisaal", "02-04-2020", 35, 15);
        Kontsert kontsert2 = new Kontsert("Rahu", "Viljandi Pärimusmuusika Ait", "30-04-2020", 20, 13);
        Piletimüük piletimüük2 = new Piletimüük(kontsert2, 10, 10);
        int kohtadeArv = kontsert2.getMüüdavatePiletiteArv();
        //Kontsert[] kohad = new Kontsert[kohtadeArv];

        //loon kohtade arvu massiivi, 1 kuni müüdavate piletite koguarv
        int[] kohad = new int[kohtadeArv];
        for (int i = 0; i < kohtadeArv; i++) {
            kohad[i] = i +1;
        }
        //System.out.println(Arrays.toString(kohad));

        //Loon müüdud kohtade listi
        List<Integer> kohtadeList = new ArrayList<>();

        //Programmi tutvustav tekst
        System.out.println("Tere tulemast! Selle programmi abil saab osta kontsertide pileteid.");

        //Kasutajalt küsitakse

        //Soovitud kontsert
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Sisesta soovitud kontserdi nimi: ");
        String soovitudKontserdiNimi = scan1.next();
        System.out.println(kontsert2.toString());

        //Toimumise kuupäev - peaks vist täiendama kellaajaga või tegema uue küsimise, et oleks kuupäev ja kellaaeg eraldi
        /*SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Sisesta kuupäev kujul: kuu-päev-aasta");
        System.out.print("Sisesta kuupäev: ");
        String soovitudKuupäev = scan2.nextLine();

        try {
            Date date = sdf.parse(soovitudKuupäev);

            sdf = new SimpleDateFormat("EEE, d MMM yyyy");
            System.out.println("Soovitud kuupäev: " + sdf.format(date));
        } catch (ParseException e) {
            System.out.println("Parse Exception");
        }
*/
        //Soovitud piletite arv. Siia tuleks veel lisada, et kui soovitud kohtade arv on
        //suurem kui müüdavate kohtade arv, siis tuleb mingi teade ja küsitakse uuesti.
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Sisesta soovitud piletite arv");
        int soovitudPiletiteArv = scan3.nextInt();
        System.out.println("Soovitud pileteid: " + soovitudPiletiteArv);

        //Kas soovitakse kohta valida või tuleb juhuslikult genereerida?
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Kui soovite kohta valida järjest, siis vastake jah, kui soovite juhuslikke kohti, siis vastake ei");
        String valik = scan4.next();
        System.out.println(valik);

        if (valik.equals("jah")) {
            for (int i = 0; i < soovitudPiletiteArv; i++) {
                //Soovitud rida
                //Scanner rida = new Scanner(System.in);
                //System.out.println("Sisesta soovitud rida");
                //int soovitudRida = rida.nextInt();
                //System.out.println("Soovitud koht on: " + soovitudKoht);
                //int soovitudRida = reserveeri();
                if (soovitudPiletiteArv < kohtadeArv) {
                    int soovitudKoht = kohad[i];
                    kohtadeList.add(soovitudKoht);
                    System.out.println("Pakutud koht on: " + soovitudKoht);
                }
                //Soovitud koht
                //Scanner kohad = new Scanner(System.in);
                //System.out.println("Sisesta soovitud koht");
                //int soovitudKoht = kohad.nextInt();

            }
            } else if (valik.equals("ei")) {
                for (int i = 0; i < soovitudPiletiteArv; i++) {
                    //proovisin, et kui juhuslikke kohti genereeritakse rohkem, siis võivad need korduda
                    //seda ei tohiks olla, peab veel mõtlema kuidas oleksid need erinevad.
                    int juhuslikKoht = (int) (Math.random() * (kohad.length +1));
                    kohtadeList.add(juhuslikKoht);
                    System.out.println("Juhuslikult valitud koht on: " + juhuslikKoht);
                }

            }

        //Sorteerime võetud kohtade listi.
        Collections.sort(kohtadeList);

        //Teeme kohtade listi String tüüpi muutujateks ja lisame välja printimiseks komad kohtade numbrite vahele.
        List<String> kohadStringiks = new ArrayList<>();
        for(Integer koht :  kohtadeList) {
            kohadStringiks.add(String.valueOf(koht));
        }
        String võetudKohad = String.join(", ", kohadStringiks);

        // Prindime välja võetud kohtade nimekirja.
        System.out.println("Hõivatud on kohad " + võetudKohad);

        }

        }


