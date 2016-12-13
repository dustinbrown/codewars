#!/usr/bin/env python3
from nose.tools import assert_equals

def in_array(array1, array2):
    return sorted({a1 for a1 in array1 if any(a1 for a2 in array2 if a1 in a2)})

if __name__ == '__main__':
    import unittest

    class TestStringMethods(unittest.TestCase):

            def test_upper(self):
                a1 = ["live", "arp", "strong"]
                a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
                r = ['arp', 'live', 'strong']
                assert_equals(in_array(a1, a2), r)

    unittest.main()
