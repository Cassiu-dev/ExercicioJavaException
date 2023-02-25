package model.entities3;

import model.exception3.DomainException3;

public class Account3 {
	
	 
		private Integer number;
		private String holder;
		private Double balanced;
		private Double withdrawLimit;		



		

		public Account3(Integer number, String holder, Double balanced, Double withdrawLimit) {
			super();
			this.number = number;
			this.holder = holder;
			this.balanced = balanced;
			this.withdrawLimit = withdrawLimit;
		}

		public Integer getNumber() {
			return number;
		}

		public String getHolder() {
			return holder;
		}

		public Double getBalanced() {
			return balanced;
		}

		public Double getWithdrawLimit() {
			return withdrawLimit;
		}
		
		public void deposit (Double amount) {
			balanced = balanced + amount;
		}
		
		public void withdrawn(Double amount) throws DomainException3{
			if(amount > balanced) {
				throw new DomainException3 ("Not enough balance");
			}
			if(amount > withdrawLimit) {
				throw new DomainException3 ("The amount exceeds withdrawn limit");
			}
			
			balanced = balanced - amount;
		}
		
		public  String toString() {
			return
					"New Balanced: $"
				+	balanced;
					
		}
	}

