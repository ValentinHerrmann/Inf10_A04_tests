package test;

import wrappers.*;
import levenshtein.*;


import static levenshtein.StructuralLevenshtein.DetailLevel.ONE_PER_CLASS;
import static levenshtein.StructuralLevenshtein.structuralTestFactory;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import levenshtein.LevenshteinTest;

import java.util.List;



@LevenshteinTest
public class TestManager {

    static MainWrapper<?> mainClz;

    public static MainWrapper<?> mainClz() {
        return mainClz;
    }

    @BeforeAll
    static void beforeAll() {
        mainClz = new MainWrapper<>();
    }

    void testCompilationAndSetup() {
        assertThat(mainClz).isNotNull();
        assertThat(mainClz).isInstanceOf(MainWrapper.class);

    }
    
    @TestFactory
    List<DynamicTest> strukturTests() {
        testCompilationAndSetup();
        return structuralTestFactory(
            ONE_PER_CLASS,
            mainClz
        );
    }

    @Test
    void Aufgabe1_ZeilenAnzahl() {
        try {
            Tests.Aufgabe1_ZeilenAnzahl();
        }
        catch (AssertionError e) {
            fail(e.getMessage());
        }
    }






    @Test
    void Aufgabe1_Inhalt() {
        try {
            Tests.Aufgabe1_Inhalt();
        }
        catch (AssertionError e) {
            fail(e.getMessage());
        }
    }

    @Test
    void Aufgabe2_ZeilenAnzahl() {
        try {
            Tests.Aufgabe2_ZeilenAnzahl();
        }
        catch (AssertionError e) {
            fail(e.getMessage());
        }
    }

    @Test
    void Aufgabe2_Inhalt() {
        try {
            Tests.Aufgabe2_Inhalt();
        }
        catch (AssertionError e) {
            fail(e.getMessage());
        }
    }

    @Test
    void Aufgabe3_ZeilenAnzahl() {
        try {
            Tests.Aufgabe3_ZeilenAnzahl();
        }
        catch (AssertionError e) {
            fail(e.getMessage());
        }
    }

    @Test
    void Aufgabe3_Inhalt() {
        try {
            Tests.Aufgabe3_Inhalt();
        }
        catch (AssertionError e) {
            fail(e.getMessage());
        }
    }

    @Test
    void Aufgabe4_ZeilenAnzahl() {
        try {
            Tests.Aufgabe4_ZeilenAnzahl();
        }
        catch (AssertionError e) {
            fail(e.getMessage());
        }
    }

    @Test
    void Aufgabe4_Inhalt() {
        try {
            Tests.Aufgabe4_Inhalt();
        }
        catch (AssertionError e) {
            fail(e.getMessage());
        }
    }

    @Test
    void Aufgabe5_ZeilenAnzahl() {
        try {
            Tests.Aufgabe5_ZeilenAnzahl();
        }
        catch (AssertionError e) {
            fail(e.getMessage());
        }
    }

    @Test
    void Aufgabe5_Inhalt() {
        try {
            Tests.Aufgabe5_Inhalt();
        }
        catch (AssertionError e) {
            fail(e.getMessage());
        }
    }

}

