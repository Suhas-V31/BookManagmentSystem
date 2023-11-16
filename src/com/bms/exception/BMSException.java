package com.bms.exception;

public class BMSException extends RuntimeException{
		
		private String info;
		
		public BMSException(String info) {
			
			super();
			this.info = info;
		}

		public String getInfo() {
			return info;
		}

	}


