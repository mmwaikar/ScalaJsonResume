package org.jsonresume

/**
  * Created by mmwaikar on 27-03-17.
  */
case class Resume (basics: Basics, work: Seq[Work], volunteer: Seq[Volunteer], education: Seq[Education],
                   awards: Seq[Award], publications: Seq[Publisher], skills: Seq[Skill], languages: Seq[Language],
                   interests: Seq[Interest], references: Seq[Reference])
