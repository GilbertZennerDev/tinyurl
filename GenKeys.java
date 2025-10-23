/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   GenKeys.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: gzenner <gzenner@student.42.fr>            +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/07/30 09:22:25 by gzenner           #+#    #+#             */
/*   Updated: 2025/07/30 10:19:30 by gzenner          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class GenKeys
{
    public static boolean notinarr(String key, ArrayList<String> unique_keys)
    {
        int i;

        i = 0;
        while (i < unique_keys.size())
        {
            if (unique_keys.get(i) == key)
            {
                return (false);
            }
            ++i;
        }
        return (true);
    }
    
    public static void main(String[] args)
    {
        int i;
        String key = new String();
        System.out.println("Generating Keys");
        
        ArrayList<String> unique_keys = new ArrayList<String>();
        while (unique_keys.size() < 1e4)
        {
                key = "";
                
                i = 0;
                while(i++ < 20)
                    key += (char)(97 + Math.floor(Math.random()*26));
                if (notinarr(key, unique_keys))
                    unique_keys.add(key);
        }
        System.out.println("Done generating the keys");
        try
        {
                FileWriter keyfile = new FileWriter("javakeys");
                
                i = 0;
                while (i < unique_keys.size())
                    keyfile.write(unique_keys.get(i++)+"\n");
                keyfile.close();
                System.out.println("Saved Keys to File javakeys");
        }
        catch (IOException e)
        {
                System.out.println("Error");
                e.printStackTrace();
        }
    }
}