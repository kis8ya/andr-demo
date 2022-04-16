Feature: Search by keyword

  Scenario: Translate on SERP
    Given Gerald is looking for translation on SERP
    When he looks up "raccoon translate"
    Then he should see translation "Основной перевод: енот"
