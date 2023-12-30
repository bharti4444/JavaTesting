package day13_Interfaces;

public class SevenStarHospital extends GlobalPatientData implements USAMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation{

	// Declaration and Definition/Initialization

		final int i = 9;

		public void Nephrology() {

		}

		public void Cardiology() {

		}

		@Override
		public void Alzeimer() {

		}

		@Override
		public void Parkinsons() {

		}

		@Override
		public void Cancer() {

		}

		@Override
		public void Ortho(String country) {

			if (country.equals("USA")) {

				System.out.println("USA");
			} else if (country.equals("UK")) {
				System.out.println("UK");
			} else if (country.equals("INDIA")) {
				System.out.println("INDIA");
			}

		}

		@Override
		public void Diabetes() {
			// TODO Auto-generated method stub

		}

		@Override
		public void Hypertension() {
			// TODO Auto-generated method stub

		}

		@Override
		public void Orthology() {
			// TODO Auto-generated method stub

		}

		@Override
		public void Neurology() {
			// TODO Auto-generated method stub

		}

		@Override
		public void Dental() {
			// TODO Auto-generated method stub

		}

		@Override
		public void Jaundice() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Ebola() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Covid() {
			// TODO Auto-generated method stub
			
		}

	}

