# jenkins-flask-app

## Description
Ce projet contient une application web minimaliste développée avec Flask, ainsi que des tests unitaires écrits en Pytest. L'objectif principal de ce projet est de démontrer l'intégration et le test d'une application Flask dans un pipeline Jenkins.

## Structure
- app.py : Contient le code de l'application Flask avec une route simple qui retourne "Hello, World!".
- /tests/test_app.py : Contient les tests unitaires pour l'application Flask, utilisant Pytest pour vérifier que la route principale fonctionne correctement.

## Objectif
L'objectif de ce projet est de fournir un exemple simple et minimaliste d'une application Flask avec des tests unitaires, afin de tester et valider un pipeline CI/CD avec Jenkins. Ce projet peut servir de point de départ pour des configurations de pipeline plus complexes.

## Exécution des Tests
Pour exécuter les tests, utilisez la commande suivante :
```bash
pytest tests
```
Cela lancera Pytest et exécutera les tests définis dans test_app.py.
