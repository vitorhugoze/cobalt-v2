package it.auties.whatsapp;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

// IMPORTANT !!!!
// If you run this CI on a brand-new number it will 99% ban it because it adds a person to a group which is considered spam
// I repeat: DO NOT RUN THIS CI LOCALLY ON A BRAND-NEW NUMBER OR IT WILL GET BANNED
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class TestLibrary {
	
}
