/*
 * Copyright (c) 2013-2015 Mozilla Foundation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
 * DEALINGS IN THE SOFTWARE.
 */

/*
 * THIS IS A GENERATED FILE. PLEASE DO NOT EDIT.
 * Instead, please regenerate using generate-encoding-data.py
 */

package nu.validator.encoding;

import java.nio.charset.CharsetDecoder;

class Windows1252 extends Encoding {

    private static final char[] TABLE = {
        '\u20ac',
        '\u0081',
        '\u201a',
        '\u0192',
        '\u201e',
        '\u2026',
        '\u2020',
        '\u2021',
        '\u02c6',
        '\u2030',
        '\u0160',
        '\u2039',
        '\u0152',
        '\u008d',
        '\u017d',
        '\u008f',
        '\u0090',
        '\u2018',
        '\u2019',
        '\u201c',
        '\u201d',
        '\u2022',
        '\u2013',
        '\u2014',
        '\u02dc',
        '\u2122',
        '\u0161',
        '\u203a',
        '\u0153',
        '\u009d',
        '\u017e',
        '\u0178',
        '\u00a0',
        '\u00a1',
        '\u00a2',
        '\u00a3',
        '\u00a4',
        '\u00a5',
        '\u00a6',
        '\u00a7',
        '\u00a8',
        '\u00a9',
        '\u00aa',
        '\u00ab',
        '\u00ac',
        '\u00ad',
        '\u00ae',
        '\u00af',
        '\u00b0',
        '\u00b1',
        '\u00b2',
        '\u00b3',
        '\u00b4',
        '\u00b5',
        '\u00b6',
        '\u00b7',
        '\u00b8',
        '\u00b9',
        '\u00ba',
        '\u00bb',
        '\u00bc',
        '\u00bd',
        '\u00be',
        '\u00bf',
        '\u00c0',
        '\u00c1',
        '\u00c2',
        '\u00c3',
        '\u00c4',
        '\u00c5',
        '\u00c6',
        '\u00c7',
        '\u00c8',
        '\u00c9',
        '\u00ca',
        '\u00cb',
        '\u00cc',
        '\u00cd',
        '\u00ce',
        '\u00cf',
        '\u00d0',
        '\u00d1',
        '\u00d2',
        '\u00d3',
        '\u00d4',
        '\u00d5',
        '\u00d6',
        '\u00d7',
        '\u00d8',
        '\u00d9',
        '\u00da',
        '\u00db',
        '\u00dc',
        '\u00dd',
        '\u00de',
        '\u00df',
        '\u00e0',
        '\u00e1',
        '\u00e2',
        '\u00e3',
        '\u00e4',
        '\u00e5',
        '\u00e6',
        '\u00e7',
        '\u00e8',
        '\u00e9',
        '\u00ea',
        '\u00eb',
        '\u00ec',
        '\u00ed',
        '\u00ee',
        '\u00ef',
        '\u00f0',
        '\u00f1',
        '\u00f2',
        '\u00f3',
        '\u00f4',
        '\u00f5',
        '\u00f6',
        '\u00f7',
        '\u00f8',
        '\u00f9',
        '\u00fa',
        '\u00fb',
        '\u00fc',
        '\u00fd',
        '\u00fe',
        '\u00ff'
    };
    
    private static final String[] LABELS = {
        "ansi_x3.4-1968",
        "ascii",
        "cp1252",
        "cp819",
        "csisolatin1",
        "ibm819",
        "iso-8859-1",
        "iso-ir-100",
        "iso8859-1",
        "iso88591",
        "iso_8859-1",
        "iso_8859-1:1987",
        "l1",
        "latin1",
        "us-ascii",
        "windows-1252",
        "x-cp1252"
    };
    
    private static final String NAME = "windows-1252";
    
    static final Encoding INSTANCE = new Windows1252();
    
    private Windows1252() {
        super(NAME, LABELS);
    }

    @Override public CharsetDecoder newDecoder() {
        return new InfallibleSingleByteDecoder(this, TABLE);
    }

}
