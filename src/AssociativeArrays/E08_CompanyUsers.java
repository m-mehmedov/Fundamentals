package AssociativeArrays;

import java.util.*;

public class E08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, List<String>> companyMap = new TreeMap<>();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("End")){
            String companyID = inputLine.split(" -> ")[0];
            String employeeID = inputLine.split(" -> ")[1];
            List<String> employeesList = new ArrayList<>();

            if (companyMap.containsKey(companyID))
                employeesList = companyMap.get(companyID);

            if (!employeesList.contains(employeeID))
                employeesList.add(employeeID);

            companyMap.put(companyID, employeesList);

            inputLine = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyMap.entrySet()){
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }
    }
}
