package com.Agrimax.Agrimax;

import java.util.ArrayList;
import java.util.List;

import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.CSVLoader;
import weka.classifiers.functions.LinearRegression;

public class Model {

    public double MLModel(String crop,int fertilizers,int perni,int kapni,int investment,int temperature,int land,int region,int rain,int area) {
        // Load the CSV file
    	
		System.out.println(" \nCrop: "+crop+"\nFertilizer:"+fertilizers+"\nperni:"+perni+"\nkapni:"+kapni+"\ninvestment:"+investment+"\ntemperature:"+temperature+"\nland:"+land+"\nregion:"+region+"\nrain:"+rain);

        String filePath = "INFO.csv";
        Instances dataset = loadCSV(filePath);

        // Ensure the class attribute is set correctly
        if (dataset.classIndex() < 0) {
            dataset.setClassIndex(dataset.numAttributes() - 1);
        }

        
     // Search for the crop name in the dataset
        int cropIndex = -1; // Initialize to -1, indicating crop not found

        for (int i = 0; i < dataset.numInstances(); i++) {
            Instance instance = dataset.instance(i);
            String currentCrop = instance.stringValue(0); // Assuming crop name is in the first attribute/column

            if (currentCrop.equalsIgnoreCase(crop)) {
                cropIndex = i;
                break; // Stop searching once the crop is found
            }
        }
        
        
        try {
            // Split the dataset into training and testing sets (80% - 20%)
            int trainSize = (int) (dataset.numInstances() * 1);
            int testSize = dataset.numInstances() - trainSize;
            Instances trainData = new Instances(dataset, 0, trainSize);
            
         // Create and train the linear regression model
            LinearRegression regressor = new LinearRegression();
            regressor.buildClassifier(trainData);

         

         // Manual data for x_test
            double[] manualData = {cropIndex, temperature, area, land, fertilizers, region, perni, kapni, rain, investment}; // Replace 0 with the desired value for "Profit"

            // Create a new instance for manual data
            Instance manualInstance = new DenseInstance(dataset.numAttributes());
            manualInstance.setDataset(dataset); // Assign the dataset to the instance

            for (int i = 0; i < manualData.length; i++) {
                manualInstance.setValue(i, manualData[i]);
            }

            // Remove the class attribute from manualInstance
            manualInstance.setClassMissing();

            System.out.println(manualInstance);
            double pred = regressor.classifyInstance(manualInstance);

            System.out.println("This is manual Data insertion to the database:"+pred);
            
            return pred;

        } catch (Exception e) {
            e.printStackTrace();
        }
		return 0;
    }

    private static Instances loadCSV(String filePath) {
        try {
            // Use the Weka CSVLoader to load the CSV file
            CSVLoader loader = new CSVLoader();
            loader.setSource(new java.io.File(filePath));
            Instances data = loader.getDataSet();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
