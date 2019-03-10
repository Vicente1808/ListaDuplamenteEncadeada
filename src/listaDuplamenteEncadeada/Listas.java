/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaDuplamenteEncadeada;

/**
 *
 * @author pablo
 */
public class Listas {
    public static void main(String[] args) {
        Onibus bus1 = new Onibus("Neobus", "MegaBRT", "Volvo", "B12M", 1012);
        Onibus bus2 = new Onibus("Neobus", "MegaBRT", "Volvo", "B12M", 2012);
        Onibus bus3 = new Onibus("Neobus", "MegaBRT", "Volvo", "B12M", 3012);
        Onibus bus4 = new Onibus("Neobus", "MegaBRT", "Volvo", "B12M", 4012);
        Onibus bus5 = new Onibus("Neobus", "MegaBRT", "Volvo", "B12M", 5012);
        Onibus bus6 = new Onibus("Neobus", "MegaBRT", "Volvo", "B12M", 6012);
        Onibus bus7 = new Onibus("Neobus", "MegaBRT", "Volvo", "B12M", 7012);
        Onibus bus8 = new Onibus("Neobus", "MegaBRT", "Volvo", "B12M", 8012);
        Onibus bus9 = new Onibus("Neobus", "MegaBRT", "Volvo", "B12M", 9012);
        Onibus bus10 =new Onibus("Neobus", "MegaBRT", "Volvo", "B12M", 9912);
        Onibus bus11 = new Onibus("Marcoplo", "Torino 1999", "Volvo", "B10M", 1501);
        Onibus bus12 = new Onibus("Marcoplo", "Torino 1999", "Volvo", "B10M", 1502);
        Onibus bus13 = new Onibus("Marcoplo", "Torino 1999", "Volvo", "B10M", 1503);
        Onibus bus14 = new Onibus("Marcoplo", "Torino 1999", "Volvo", "B10M", 1504);
        Onibus bus15 = new Onibus("Marcoplo", "Torino 1999", "Volvo", "B10M", 1505);
        Onibus bus16 = new Onibus("Marcoplo", "Torino 1999", "Volvo", "B10M", 1506);
        Onibus bus17 = new Onibus("Marcoplo", "Torino 1999", "Volvo", "B10M", 1507);
        Onibus bus18 = new Onibus("Comil", "Doppio 2000", "Volksbus", "17.210 EOD", 1511);
        Onibus bus19 = new Onibus("Comil", "Doppio 2000", "Volksbus", "17.210 EOD", 1512);
        Onibus bus20 = new Onibus("Comil", "Doppio 2000", "Volksbus", "17.210 EOD", 1513);
        Onibus bus21 = new Onibus("Comil", "Doppio 2000", "Volksbus", "17.210 EOD", 1514);
        Onibus bus22 = new Onibus("Comil", "Doppio 2000", "Volksbus", "17.210 EOD", 1515);
        Onibus bus23 = new Onibus("Comil", "Doppio 2000", "Volksbus", "17.210 EOD", 1516);
        Onibus bus24 = new Onibus("Marcopolo", "GranViale", "Mercades-Benz", "O-500MA", 1517);
        Onibus bus25 = new Onibus("Caio Induscar", "Apache Vip II", "Volksbus", "17.230 EOD", 1518);
        Onibus bus26 = new Onibus("Caio Induscar", "Apache Vip II", "Volksbus", "17.230 EOD", 1519);
        Onibus bus27 = new Onibus("Caio Induscar", "Apache Vip II", "Volksbus", "17.230 EOD", 1520);
        Onibus bus28 = new Onibus("Caio Induscar", "Apache Vip II", "Volksbus", "17.230 EOD", 1521);
        Onibus bus29 = new Onibus("Caio Induscar", "Apache Vip II", "Volksbus", "17.230 EOD", 1522);

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.inserir(bus1);
        lista.inserir(bus2);
        lista.inserir(bus3);
        lista.inserir(bus4);
        lista.inserir(bus5);
        lista.inserir(bus7);
        System.out.println("------------------------Inserção Na Lista-------------------------");
        System.out.println(lista.exibirLista());
        System.out.println("------------------------Lista Atualizada--------------------------");
        System.out.println("");
        System.out.println("Onibus com prefixo: 1551 encontra-se na lista: "+lista.Buscar(1511));
        System.out.println("");

        System.out.println("--------------------Curosor");
        System.out.println("Cursor avança 2 passo: ");
        lista.avançarKPassos(2);
        System.out.println(lista.getCursor());
        System.out.println("");
        System.out.println("--------------------Lista exclui atual-----------------------------");
        lista.excluirAtual();
        System.out.println("---------------------------lista atualizada--------------------------");
        System.out.println(lista.exibirLista());

        //lista.inserir(bus8);
        //System.out.println(lista.getCursor());
        lista.excluirAtual();
        System.out.println(lista.getCursor());
        lista.avançarKPassos(2);
        System.out.println(lista.exibirLista());
        System.out.println(lista.getCursor());

    }
}
