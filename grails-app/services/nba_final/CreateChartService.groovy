package nba_final

import org.jfree.chart.ChartFactory
import org.jfree.chart.ChartUtilities
import org.jfree.chart.ChartPanel
import org.jfree.chart.JFreeChart
import org.jfree.data.category.DefaultCategoryDataset
import org.jfree.data.general.DefaultPieDataset
import org.springframework.transaction.annotation.Transactional
import groovy.swing.SwingBuilder
import java.awt.*
import javax.swing.WindowConstants as WC

@Transactional
class CreateChartService {
    def getChart(){
        def dataset = createDataset()
        def chart = createChart(dataset)
        return chart
    }

    def createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset()
        dataset.addValue(2000,"X",1)
        dataset.addValue(3300,"X",2)
        dataset.addValue(2000,"X",3)
        dataset.addValue(3300,"X",4)
        return dataset
    }

    def createChart(dataset){
        //JFreeChart chart = ChartFactory.createLineChart("Widget not rendered","X","Count",dataset,PlotOrientation.VERTICAL,false,true,false)
        //return chart
    }
    def serviceMethod() {
       
    }
    def plotGraph(){
        //        ChartBuilder cb = new ChartBuilder()
        try{
            def piedataset = new DefaultPieDataset();
            piedataset.with {
                setValue "Apr", 5
                setValue "May", 30
                setValue "June", 15
                setValue "July", 50
            }

            //this will generate chart 
            def options = [true, true, true]
            def chart = ChartFactory.createPieChart("Pie Chart Sample",
                piedataset, *options)
            chart.backgroundPaint = Color.white
            
            //this code will generate frame for displaying chart
            def swing = new SwingBuilder()
            def frame = swing.frame(title:'Groovy PieChart',
                defaultCloseOperation:WC.DISPOSE_ON_CLOSE) {
                panel(id:'canvas') { widget(new ChartPanel(chart)) }
            }
            frame.pack()
            def val = frame.requestFocusInWindow();
            println(val)
            frame.show()
        }
        catch(Exception e)
        {
            println(e)
        }
        println("frame shown")
    }
    
}
