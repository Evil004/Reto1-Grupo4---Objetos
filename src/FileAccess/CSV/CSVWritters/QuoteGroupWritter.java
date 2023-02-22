package FileAccess.CSV.CSVWritters;


import Data.QuoteGroup.QuoteGroup;
import Data.QuoteGroup.QuoteGroupsData;

import java.io.File;
import java.util.ArrayList;

/**
 * @author Óscar Fernandez
 *
 */
public class QuoteGroupWritter extends CSVWritter {

    public QuoteGroupWritter(File file) {
        super(file);
    }

    public QuoteGroupWritter(String path){
        super(path);
    }

    @Override
    String getColumns() {
        return QuoteGroupsData.getColumns();
    }

    @Override
    public void writeData() {
        ArrayList<ArrayList<String>> quoteGroupsData = new ArrayList<>();

        ArrayList<QuoteGroup> quoteGroups = QuoteGroupsData.getQuoteGroups();

        for (QuoteGroup quoteGroup: quoteGroups) {
            ArrayList<String> quoteGroupData = new ArrayList<>();

            quoteGroupData.add(String.valueOf(quoteGroup.getId()));
            quoteGroupData.add(String.valueOf(quoteGroup.getSalaryBase()));

            quoteGroupsData.add(quoteGroupData);


        }
        super.writeFile(quoteGroupsData);
    }
}

