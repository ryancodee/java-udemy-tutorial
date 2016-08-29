package collections11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;


// class implements iterable so we can iterate on it
public class URLlibrary implements Iterable<String> {
	private LinkedList<String> urls = new LinkedList<String>();
	
	private class urlIterator implements Iterator<String> {
		
		private int index = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < urls.size();
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			
			StringBuilder sb= new StringBuilder();
			
			try {
				URL url = new URL(urls.get(index));
				
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
								
				String line = null;
				
				while( (line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
				}
				
				br.close();
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			index++;
			
			 return sb.toString();
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			urls.remove(index);
		}
		
	}
	
	public URLlibrary() {
		urls.add("http://www.caveofprogramming.com");
		urls.add("http://www.facebook.com");
		urls.add("http://news.bbc.co.uk");
	}
	
	// create your own iterable
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new urlIterator();
	}
	
	// implement iterator
	// @Override
	// public Iterator<String> iterator() {
	// // TODO Auto-generated method stub
	// return urls.iterator();
	// }
	
}
