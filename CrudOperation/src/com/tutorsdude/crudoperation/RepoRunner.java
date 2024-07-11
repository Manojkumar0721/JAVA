package com.tutorsdude.crudoperation;

public class RepoRunner {

	public static void main(String[] args) {

		Repository repo = new Repository();
		repo.saveName("Manu");
		repo.saveName("Sarvam");
		repo.saveName("Ma");
		repo.saveName("Varshi");
		repo.saveName("SaiKumar");
		repo.saveName(null);
		repo.saveName("Akhiles");
		repo.saveName("Rakshita");
		repo.saveName("");
		repo.saveName("Krishna");
		repo.saveName("Sudarshan");
		repo.saveName("Basavaraj");
		repo.saveName("Siddu");

	}

}
