/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
// variables

        char vocal = 0;
//entrada
        boolean testOK = false;
//bucle
        do {
            do {
                try {
//Entrada
                    System.out.println("Ingresa una vocal ... ");
                    vocal = SCN.nextLine().charAt(0);
                    testOK = true;
// Entrada incorrecta
                } catch (Exception e) {
                    System.out.println("ERROR: Entrada incorrecta");
                }
            } while (!testOK);
// comprobar vocal
            if (vocal != 'A' && vocal != 'E' && vocal != 'I' && vocal != 'O' && vocal != 'U') {
                System.out.println("ERROR: Vocal incorrecta");
            }
        } while (vocal != 'A' && vocal != 'E' && vocal != 'I' && vocal != 'O' && vocal != 'U');
//salida
        System.out.printf(Locale.ENGLISH, "Vocal seleccionada ......: %c%n", vocal);

    }
}
