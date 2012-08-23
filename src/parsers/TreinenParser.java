package parsers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import models.Company;
import models.Station;

public class TreinenParser {
	public static void main(String[] args) throws URISyntaxException, IOException {
		new TreinenParser();
	}
	
	public ArrayList<Company> companies;
	private ArrayList<Station> stations;
	
	public TreinenParser() throws URISyntaxException, IOException {
		parseCompanies();
		parseStations();
	}
	
	/**
	 * Bestand openen.
	 * @param name
	 * @return BufferedReader van bestand
	 * @throws URISyntaxException
	 * @throws FileNotFoundException
	 */
	private BufferedReader openFile(String name) throws URISyntaxException, FileNotFoundException {
		File file = new File(getClass().getResource("/resource/treinen/"+name).toURI());
		InputStreamReader stream = new InputStreamReader(new FileInputStream(file), Charset.forName("ISO-8859-1"));
		return new BufferedReader(stream);
	}
	
	
	private void parseCompanies() throws URISyntaxException, FileNotFoundException,
			IOException {
		companies = new ArrayList<Company>();
		String line;
		BufferedReader br = openFile("company.dat");
		//ignore first line
		br.readLine();
		while ((line = br.readLine()) != null) {
			Company company = new Company();
			company.setId(Integer.parseInt(line.substring(0, 2)));
			company.setCode(line.substring(4, 13));
			company.setName(line.substring(15, 44));
			company.setTime(Integer.parseInt(line.substring(46, 49)));
			companies.add(company);
		}
	}
	
	private void parseStations() throws URISyntaxException, FileNotFoundException,
	IOException {
		stations = new ArrayList<Station>();
		String line;
		BufferedReader br = openFile("stations.dat");
		//ignore first line
		br.readLine();
		while ((line = br.readLine()) != null) {
			Station station = new Station();
			station.setTrainChanges(Integer.parseInt(line.substring(0, 0)));
			station.setShortName(line.substring(2, 8));
			
			System.out.println(line);
			/*station.setId(Integer.parseInt(line.substring(0, 2)));
			station.setCode(line.substring(4, 13));
			station.setName(line.substring(15, 44));
			station.setTime(Integer.parseInt(line.substring(46, 49)));*/
			stations.add(station);
		}
	}
}
