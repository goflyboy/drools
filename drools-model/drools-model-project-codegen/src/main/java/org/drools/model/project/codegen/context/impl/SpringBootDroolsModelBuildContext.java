/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.model.project.codegen.context.impl;

public class SpringBootDroolsModelBuildContext extends AbstractDroolsModelBuildContext {

    public static final String CONTEXT_NAME = "Spring";
    public static final String SPRING_REST = "org.springframework.web.bind.annotation.RestController";
    public static final String SPRING_DI = "org.springframework.beans.factory.annotation.Autowired";

    protected SpringBootDroolsModelBuildContext(SpringBootKogitoBuildContextBuilder builder) {
        super(builder, /* new SpringDependencyInjectionAnnotator(), new SpringRestAnnotator(),*/ CONTEXT_NAME);
    }

    @Override
    public boolean hasDI() {
        return true;
    }

    public static Builder builder() {
        return new SpringBootKogitoBuildContextBuilder();
    }

    protected static class SpringBootKogitoBuildContextBuilder extends AbstractBuilder {

        protected SpringBootKogitoBuildContextBuilder() {
        }

        @Override
        public SpringBootDroolsModelBuildContext build() {
            return new SpringBootDroolsModelBuildContext(this);
        }

        @Override
        public String toString() {
            return SpringBootDroolsModelBuildContext.CONTEXT_NAME;
        }
    }
}