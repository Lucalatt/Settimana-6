package it.lucal.app;

import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import it.lucal.app.models.ProcessoDiControllo;
import it.lucal.app.models.Proxy;
import it.lucal.app.models.Sonda;

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(task, 0, 5000);

	}

	static TimerTask task = new TimerTask() {
		public void run() {

			Random r = new Random();
			Sonda s1 = new Sonda(1, 1864453135, 1863484351, r.nextInt(1, 11));
			Sonda s2 = new Sonda(2, 1456456545, 1561515315, r.nextInt(1, 11));
			Sonda s3 = new Sonda(3, 1464456456, 1868135454, r.nextInt(1, 11));
			Sonda s4 = new Sonda(4, 1186456456, 1864783551, r.nextInt(1, 11));
			Sonda s5 = new Sonda(5, 1564864456, 1864564564, r.nextInt(1, 11));

			ProcessoDiControllo p = new Proxy();
			p.comunicazioneAllarme(Arrays.asList(s1, s2, s3, s4, s5));

		}

	};

}
