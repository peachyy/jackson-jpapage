package com.peachyy.jackson.support;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = JacksonJpaPageImpl.class)
interface PageMixIn {
}