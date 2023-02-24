package FileAccess.CSV.CSVReaders;

import Data.QuoteGroup.QuoteGroup;
import Data.QuoteGroup.QuoteGroupsData;

import java.io.File;
import java.util.ArrayList;

public class QuoteGroupReader extends CSVReader{

	public QuoteGroupReader(String path) {
		super(path);
	}

	public QuoteGroupReader(File file) {
		super(file);
	}

	@Override
	public Object saveReadedData() {
		ArrayList<ArrayList<String>> quoteGroupsDataString = super.readFile();

		QuoteGroupsData quoteGroupsData = new QuoteGroupsData();

		QuoteGroupsData.setColumns(super.getColumnsNames());

		for (ArrayList<String> quoteGroupData : quoteGroupsDataString ) {

			int id = Integer.parseInt(quoteGroupData.get(0));
			float sueldoBase = Float.parseFloat(quoteGroupData.get(1).replace(",", "."));

			QuoteGroup quoteGroup = new QuoteGroup(id, sueldoBase);

			quoteGroupsData.addQuoteGroup(quoteGroup);
		}

		return quoteGroupsData;
	}
}
