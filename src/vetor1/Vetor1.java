package vetor1;

import java.util.ArrayList;

public class Vetor1 {

    public static void main(String[] args) {
        
        int [] vetor;
        
        vetor = new int [10];
        
        System.out.printf ("%s%8s\n", "Índice", "Valor");
        
        for (int i = 0; i < vetor.length; ++ i) {
            
            System.out.printf ("%5d%8d\n", i, vetor [i]);
            
        }
        
        testeArrayListInteger ();
        
        testeArrayListAluno ();
        
    }
    
    public static void testeArrayListInteger () {
        
        ArrayList <Integer> listaInteiros;
        
        listaInteiros = new ArrayList<>();
        
        listaInteiros.add (1);
        listaInteiros.add (2);
        listaInteiros.add (3);
        
        for (int i = 0; i < listaInteiros.size();++ i) {
            
            System.out.println (listaInteiros.get(i));
            
        }
        
        listaInteiros.add (2);
        
    }
    
    public static void testeArrayListAluno () {
        
        ArrayList <Aluno> listaAlunos;
        Aluno alunoInsercao;
        
        listaAlunos = new ArrayList<>();
        
        alunoInsercao = new Aluno ();        
        alunoInsercao.setNome("Fulano");
        alunoInsercao.setMatricula("1");
        alunoInsercao.setMediaGlobal(9.5);
        
        listaAlunos.add(alunoInsercao);
        
        alunoInsercao = new Aluno ();        
        alunoInsercao.setNome("Sicrano");
        alunoInsercao.setMatricula("2");
        alunoInsercao.setMediaGlobal(5.5);
        
        listaAlunos.add(alunoInsercao);
        
        for (int i = 0; i < listaAlunos.size();++ i) {
            
            System.out.println (listaAlunos.get(i).getNome());
            System.out.println (listaAlunos.get(i).getMatricula());
            System.out.println (listaAlunos.get(i).getMediaGlobal());
            
        }
        
    }
 
    
    
    
    
    
    
    
}
