/**
 * lab 3
 * 
 * @author Andrea Sanchez Cortes 
 * @version 1
 */
import java.util.Scanner;
import java.util.LinkedList;
public class Interaccion
{
    private static Scanner teclado = new Scanner(System.in);
        
   public static void tipoDeConsulta(){
            
        System.out.println("consulta 1:");
        System.out.println("\tSeleccione un semestre del año  y una materia para ver\n\t todos los estudiantes matriculados"+
        "respectivas notas");
        System.out.println("consulta 2: ");
        System.out.println("\tIngrese un semestre del año y un estudiante para obtener todos los cursos que"+
        "\n\tmatriculo y la nota que obvtuvieron cada uno de los estudiantes.");
        System.out.println("\nIngrese 1 o 2 ");
        int tipoConsulta = solicitarTipoConsulta();
   
    
      if (tipoConsulta == 1) {
            menuConsulta1();
        } else {
            menuConsulta2();
        }
    }
 
    private static void menuConsulta2() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite nombre del estudiante (Sin tíldes): ");
        String name = input.nextLine();
        System.out.print("Digite año y semestre juntos (Ejemplo: 2016-2): ");
        String semesterS = Integer.toString(semester);
        MarcoDeDatos.printCourses(name,semesterS);
     }
    
 private static void menuConsulta1() {
        System.out.println("\nCursos disponibles: ");
        System.out.println(" 1. Fundamentos de Programación");
        System.out.println(" 2. Estructuras Datos y Algoritmos 1");
        System.out.println(" 3. Estructuras Datos Y Algortimos 2");
        System.out.print("Digite el número de la opción que desea (1-3): ");
        int curso = solicitarCurso();
        int semester = menuSemestres();
        String semesterS = Integer.toString(semester);
        LinkedList<Estudiantes> listStudents = MarcoDeDatos.readFile(curso);
        MarcoDeDatos.filter(listStudents, semesterS);
    }

private static int  menuSemestres() {
    int semestre = 0; 
     System.out.println("semestres disponibles");
     System.out.println("semestre: 20162");
     System.out.println("semestre: 20161");
     System.out.println("semestre: 20172");
     do try {
         semestre= Integer.parseInt(teclado.nextLine());
         if (semestre != 20162 && semestre != 20612 && semestre != 2020172) {
             System.err.println ("por favor ingrese los numeros de las opciones");
             semestre =0;
            }
             } catch (Exception e) {
                System.err.println("Ingrese un numero válido: " + e.getMessage());
        }while(semestre==0);
        return semestre;
    }


private static int solicitarCurso(){
    int curso= 0;
    do{
        try{
            curso = Integer.parseInt(teclado.nextLine());
            if (curso != 1 && curso != 2 && curso != 3){
                System.err.println("Por favor ingrese un numero que este en las opciones ");
                curso = 0;
            }
        }catch (Exception e) {
            System.err.println("Ingrese un numero valido: " + e.getMessage());
        }
    }while (curso==0);
    return curso;
}

private static int solicitarTipoConsulta() {
        int tipoConsulta= 0;
        do {
            try {
                tipoConsulta = Integer.parseInt(teclado.nextLine());
                if (tipoConsulta != 1 && tipoConsulta != 2) {
                    System.err.println("Por favor ingrese un número que esté en las opciones. ");
                    tipoConsulta = 0;
                }
            } catch (Exception e) {
                System.err.println("Ingrese un numero válido: " + e.getMessage());
            }
        }while(tipoConsulta==0);
        return tipoConsulta;
    }

public static void main(String[] args) {
        tipoDeConsulta();
    }
}