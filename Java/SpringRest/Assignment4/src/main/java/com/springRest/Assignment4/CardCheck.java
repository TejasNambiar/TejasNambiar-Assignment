package com.springRest.Assignment4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardCheck {

	@GetMapping("checkCard/{cardType}/{cardNo}")
	public String checkCard(@PathVariable("cardType") String cardType, @PathVariable("cardNo") String cardNo) {

		System.out.println(cardNo + " " + cardNo.length());

		switch (cardType) {

		case "Master Card":
			if (cardNo.length() == 16) {
				if (cardNo.charAt(0) == '5' && cardNo.charAt(1) >= '1' && cardNo.charAt(1) <= '5') {
					int x = Integer.parseInt(cardNo.substring(0, 6));
					if (x >= 510000 && x <= 559999)
						return "Valid Card";
				}
				if (cardNo.charAt(0) == '2' && cardNo.charAt(1) >= '2' && cardNo.charAt(1) <= '7') {
					int x = Integer.parseInt(cardNo.substring(0, 6));
					if (x >= 222100 && x <= 272099)
						return "Valid Card";
				}
			}
			break;

		case "Visa":
			if (cardNo.length() >= 16 && cardNo.length() <= 19) {
				if (cardNo.charAt(0) == '4')
					return "Valid Card";
			}
			break;

		case "enRoute":
			if (cardNo.length() == 15) {
				int x = Integer.parseInt(cardNo.substring(0, 4));
				if (x == 2014 || x == 2149)
					return "Valid Card";
			}
			break;
		case "JCB":
			if (cardNo.length() >= 16 && cardNo.length() <= 19) {
				int x = Integer.parseInt(cardNo.substring(0, 4));
				if (x >= 3528 && x <= 3589)
					return "Valid Card";
			}
			break;
		}
		return "Invalid Card";
	}
}
