public class SalesInfo {

    public static void main(String[] args) {
        Sale sale = null;
        Map<String, List<Sale>> finalMap = new HashMap<>();
        try {
            FileInputStream file = new FileInputStream("D:\\Desktop\\Input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(";");
                sale = new Sale(arr[0], arr[1], Double.parseDouble(arr[2]), arr[3]);
                if (finalMap.containsKey(arr[1])) {
                    List<Sale> tempList = finalMap.get(arr[1]);
                    tempList.add(sale);
                    finalMap.put(arr[1], tempList);
                } else {
                    List<Sale> tempList = new ArrayList<>();
                    tempList.add(sale);
                    finalMap.put(arr[1], tempList);
                }
            }

            System.out.println("Total Amount :");
            displayTotalAmount(finalMap);

            System.out.println("Writing Data to separate files :");
            writeToFile(finalMap);
            System.out.println("Data Succssfully written to separate files!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(Map<String, List<Sale>> finalMap) {
        File file = null;
        String outputString = "";
        try {
            for (Map.Entry<String, List<Sale>> entry : finalMap.entrySet()) {
                outputString = "";
                file = new File("D:\\Desktop\\" + entry.getKey() + ".txt");
                file.createNewFile(); // if file already exists will do nothing
                FileOutputStream oFile = new FileOutputStream(file, false);
                List<Sale> saleList = entry.getValue();
                for (Sale s : saleList) {
                    outputString += s.getName() + ";" + s.getService() + ";" + s.getAmount() + ";" + s.getDate() + "\n";
                }
                byte[] strToBytes = outputString.getBytes();
                oFile.write(strToBytes);
                oFile.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void displayTotalAmount(Map<String, List<Sale>> finalMap) {
        Map<String, Double> tempMap = new HashMap<>();
        for (Map.Entry<String, List<Sale>> entry : finalMap.entrySet()) {
            List<Sale> saleList = entry.getValue();
            double d = 0;
            for (Sale s : saleList) {
                d += s.getAmount();
            }
            tempMap.put(entry.getKey(), d);
        }
        for (Map.Entry<String, Double> entry : tempMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}