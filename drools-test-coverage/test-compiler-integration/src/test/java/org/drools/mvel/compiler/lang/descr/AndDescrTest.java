/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.drools.mvel.compiler.lang.descr;

import org.drools.drl.ast.descr.AndDescr;
import org.drools.drl.ast.descr.NotDescr;
import org.drools.drl.ast.descr.PatternDescr;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AndDescrTest {

    @Test
    public void testAddUnboundPatternsEtc() {
        final AndDescr and = new AndDescr();
        and.addDescr( new NotDescr() );
        and.addDescr( new PatternDescr( "Foo" ) );
        and.addDescr( new NotDescr() );

        assertEquals( 3,
                      and.getDescrs().size() );
    }

}
