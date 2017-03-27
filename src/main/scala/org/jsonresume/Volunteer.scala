package org.jsonresume

import java.time.LocalDate

/**
  * Created by mmwaikar on 27-03-17.
  */
case class Volunteer(organization: String, position: String, website: String, startDate: LocalDate, endDate: LocalDate,
                     summary: String, highlights: Seq[String])
