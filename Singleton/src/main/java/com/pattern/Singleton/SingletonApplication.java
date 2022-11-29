package com.pattern.Singleton;

import com.pattern.Singleton.pattern.NaiveSingleton;
import com.pattern.Singleton.pattern.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);

		System.out.println("If you see the same value, then naive singleton was reused (yay!)" + "\n" +
				"If you see different values, then 2 naive singleton were created (booo!!)" + "\n\n" +
				"RESULT:" + "\n");

		NaiveSingleton naiveSingleton = NaiveSingleton.getInstance("FOO");
		NaiveSingleton anotherNaiveSingleton = NaiveSingleton.getInstance("BAR");
		System.out.println(naiveSingleton.value);
		System.out.println(anotherNaiveSingleton.value + "\n\n");


		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
				"If you see different values, then 2 singleton were created (booo!!)" + "\n\n" +
				"RESULT:" + "\n");

		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		threadFoo.start();
		threadBar.start();
	}

	static class ThreadFoo implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("FOO");
			System.out.println(singleton.value);
		}
	}

	static class ThreadBar implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("BAR");
			System.out.println(singleton.value);
		}
	}

}
