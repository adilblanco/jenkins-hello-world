import unittest
from app import replace_jenkins

class TestReplaceJenkins(unittest.TestCase):
    def test_replace_jenkins(self):
        self.assertEqual(replace_jenkins("Hello Jenkins!"), "Hello World!")
        self.assertEqual(replace_jenkins("Jenkins is great"), "World is great")
        self.assertEqual(replace_jenkins("No Jenkins here"), "No World here")
        self.assertEqual(replace_jenkins(""), "")
        self.assertEqual(replace_jenkins("Hello"), "Hello")
