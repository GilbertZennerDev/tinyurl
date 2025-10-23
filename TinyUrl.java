/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   TinyUrl.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: gzenner <gzenner@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/07/30 10:04:15 by gzenner           #+#    #+#             */
/*   Updated: 2025/07/30 10:32:02 by gzenner          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class TinyUrl
{
    public static void main(String[] args)
    {
        ArrayList<String> keys = new ArrayList<String>();
        System.out.println("Success");
        try
        {
            File keyfile = new File("javakeys");
            Scanner scankeyfile = new Scanner(keyfile);
            while(scankeyfile.hasNextLine())
                keys.add(scankeyfile.nextLine());
            scankeyfile.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        int i = 0;
        while (i < 10)
        {
            System.out.println(keys.get(i++));
        }
    }
}