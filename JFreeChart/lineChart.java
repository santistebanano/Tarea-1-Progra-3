/*
JFreeChart es una biblioteca de software libre y de código abierto para Java que se
especializa en la creación de gráficos 2D.
 */

import java.io.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartUtilities; 
public class lineChart {  
    public static void main(String[] args){
        String file = "JFreeChart/datos - Hoja 1 (1).csv";
        BufferedReader reader = null;
        String line = "";

        try {

            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");
                for(String index : row){
                    System.out.printf(index + " ");
                }
                System.out.println();
            }

                // Step - 1: Define the data for the line chart
                DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
                line_chart_dataset.addValue(200, "escuela", "1970");
                line_chart_dataset.addValue(100, "escuela", "1980");
                line_chart_dataset.addValue(400, "escuela", "1990");
                line_chart_dataset.addValue(120, "escuela", "2000");
                line_chart_dataset.addValue(240, "escuela", "2010");
                
                /* Step -2:Define the JFreeChart object to create line chart */
                JFreeChart lineChartObject=ChartFactory.createLineChart(
				  "Escuela vs Años","Año","Escuela",
				  line_chart_dataset,PlotOrientation.VERTICAL,true,true,false);                
                          
                /* Step -3 : Write line chart to a file */
                 int width=640; /* Width of the image */
                 int height=480; /* Height of the image */
                 File lineChart=new File("grafica.png");
                 ChartUtilities.saveChartAsPNG(lineChart,lineChartObject,width,height);

        }
        catch (Exception i){
             System.out.println(i);
             i.printStackTrace();
        }
        finally{
            try{
                reader.close();
            }catch(IOException i){
                i.printStackTrace();
            }
        }
    }

 }

