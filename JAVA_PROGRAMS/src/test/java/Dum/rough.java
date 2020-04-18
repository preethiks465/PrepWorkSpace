package Dum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

 class Base {
	static void foo() {
		System.out.println("Base foo");
	}

}

class derived extends Base {
	 static void foo() {
		System.out.println("child foo");
	}
	
}
	public class rough{
		public static void main(String[]args) {
			Base b = new derived();
			b.foo();
		}
	}
