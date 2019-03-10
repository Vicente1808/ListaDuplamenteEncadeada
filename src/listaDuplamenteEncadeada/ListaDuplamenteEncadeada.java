/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package listaDuplamenteEncadeada;
/**
 *
 * @author Pablo Vicente
 */
public class ListaDuplamenteEncadeada {

    private Onibus primeiro;
    private Onibus cursor;

    ListaDuplamenteEncadeada() {
    }

    public String getCursor(){
        return cursor.getPrefixo()+" | "+cursor.getEncarrocadeira()+" | "+cursor.getCarroceria()+" | "+cursor.getMarcaMotor()+" | "+cursor.getModelMotor()+ "\n";
    }
    public void inserir(Onibus onibus){
        if(primeiro ==null){
            primeiro=onibus;
            primeiro.setAnteriorBus(onibus);
            primeiro.setProximoBus(onibus);
            cursor=primeiro;
        }else{
            cursor =primeiro.getAnteriorBus();
            cursor.setProximoBus(onibus);
            onibus.setAnteriorBus(cursor);
            primeiro.setAnteriorBus(onibus);
            onibus.setProximoBus(primeiro);
            cursor=primeiro.getAnteriorBus();
        }
    }
    public void excluir(){
        if(primeiro==null){

        }else if(primeiro==primeiro.getProximoBus()){
            primeiro =null;
            //Retorno lista vazia;
        }else{
            cursor = primeiro.getAnteriorBus().getAnteriorBus();
            cursor.setProximoBus(primeiro);
            primeiro.setAnteriorBus(cursor);
        }
    }
    public void InserirAntesDoAtual(Onibus onibus){
        if(primeiro==null){
            inserir(onibus);
        }else if(primeiro==primeiro.getProximoBus()){
            primeiro.setProximoBus(onibus);
            primeiro.setAnteriorBus(onibus);
            onibus.setAnteriorBus(primeiro);
            onibus.setProximoBus(primeiro);
            primeiro=onibus;

        }else{
            Onibus anterior = cursor.getAnteriorBus();
            anterior.setProximoBus(onibus);
            onibus.setProximoBus(cursor);
            cursor.setAnteriorBus(onibus);
            onibus.setAnteriorBus(anterior);
        }
    }/*
    public void inserirAposAtual(Onibus onibus){
        if(primeiro==null){
            inserir(onibus);
        }else{
            cursor = cursor.getProximoBus();
            InserirAntesDoAtual(onibus);
        }
    }*/
    public void excluirAtual(){
        if(primeiro!=null){
            if(primeiro==primeiro.getAnteriorBus()){
                primeiro=null;
                cursor=null;
            }else{
                Onibus anterior = cursor.getAnteriorBus();
                Onibus proximo = cursor.getProximoBus();
                anterior.setProximoBus(proximo);
                proximo.setAnteriorBus(anterior);
                cursor = anterior;
            }
        }
    }
    public boolean Buscar(int prefixo){
        boolean retorno=true;
        if(primeiro==null){
            return false;
        }else if(primeiro.getPrefixo()!=prefixo){
            cursor=primeiro.getProximoBus();
            while(cursor!=primeiro){
                retorno = cursor.getPrefixo()==prefixo;
                cursor = cursor.getProximoBus();
            }
        }

        return retorno;
    }
    public void avancarKPassos(int kPassos){
        if(primeiro!=null){
            int contador=0;
            while(contador <kPassos){
                cursor=cursor.getProximoBus();
                contador++;
            }
        }
    }
    public void retrocederKPassos (int kPassos){
        if(primeiro!=null){
            int contador=0;
            while(contador <kPassos){
                cursor=cursor.getAnteriorBus();
                contador++;
            }
        }
    }
    public void irParaPrimeiro(){
        cursor=primeiro;
    }
    public void irParaUltimo(){
        cursor=primeiro.getAnteriorBus();
    }
    public String exibirLista(){
        String retorno;
        if(primeiro==null){
            retorno = "Lista vazia";
        }else if(primeiro==primeiro.getAnteriorBus()){
            retorno = primeiro.getPrefixo()+" | "+primeiro.getEncarrocadeira()+" | "+primeiro.getCarroceria()+" | "+primeiro.getMarcaMotor()+" | "+primeiro.getModelMotor()+ "\n";
        }else{
            retorno = primeiro.getPrefixo()+" | "+primeiro.getEncarrocadeira()+" | "+primeiro.getCarroceria()+" | "+primeiro.getMarcaMotor()+" | "+primeiro.getModelMotor()+ "\n";
            Onibus temp = primeiro.getProximoBus();
            while(temp!=primeiro){
                retorno = retorno +temp.getPrefixo()+" | "+temp.getEncarrocadeira()+" | "+temp.getCarroceria()+" | "+temp.getMarcaMotor()+" | "+temp.getModelMotor()+"\n";
                temp=temp.getProximoBus();
            }
        }
        return retorno;
    }

}
